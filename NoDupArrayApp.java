/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noduparrayapp;

/**
 *
 * @author 174110J
 */
public class NoDupArrayApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NoDupArray x = new NoDupArray(10);
        x.insert(8);
        x.insert(37);
        x.insert(9);
        x.insert(23);
        x.display();
        
        x.insert(78);
        x.display();
        
        x.find(23);
        x.delete(23);
        x.delete(78);
        x.display();
    }
    
}

class NoDupArray{
    private long[] a; //ref to array a
    private int nElems;//number of data items
    
    public NoDupArray(int max){
        this.a = new long[max];
        this.nElems = 0;
    }
    
    public boolean find(long searchKey){
        for(int i=0;i<nElems;i++){
            if(this.a[i]==searchKey){
                System.out.println("number found");
                return true;
            }
        }
        //System.out.println("number not found");
        return false;
    }
    
    public void insert(long value){
        if(this.a.length==this.nElems){
        System.out.println("Array full");
        return;
        }
        if(find(value)){
            System.out.println("value is already exists");
            return;
        }
        else{
            this.a[this.nElems++]=value;
           // nElems++;
            System.out.println("value inserted");
            
        }
        
    }
    
    public boolean delete(long value){
        for(int i=0;i<nElems;i++){
            if(a[i]==value){
                for(int j=i;j<nElems-1;j++){
                    a[j]=a[j+1];
                    
                }
                nElems--;
                System.out.println("value deleted");
                return true;
            }
        }
        System.out.println("value not found");
            return false;
    }
    
    public void display(){
        for(int i=0;i<nElems;i++){
            System.out.print( a[i]+" " );
        }
        System.out.println();
    }
}
