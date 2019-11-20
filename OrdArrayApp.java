 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordarrayapp;

/**
 *
 * @author 174110J
 */
public class OrdArrayApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OrdArray x = new OrdArray(10);
        x.insert(8);
        x.insert(37);
        x.insert(37);
        x.display();
        x.delete(37);
        x.display();
          
    }
    
}

class OrdArray{
    private long []a;
    private int nElems;
    
    public OrdArray(int max){
        this.a= new long[max];
        this.nElems=0;  
    }
    
    
    
    public int size(){
        return this.a.length;
    }
    
    
    
    public int find(long searchKey){
        for(int i=0;i<this.nElems;i++){
            if(searchKey==a[i]){
                return i;
            }
        }
        System.out.println("SearchKey is not found");
        return -1;
    }
    
    
    
    public void insert(long value){
        if(size()==this.nElems){
            System.out.println("Array is full");
        }
        else{
            for(int i=0;i<this.nElems;i++){
                if(value<a[i]){
                    for(int j=this.nElems;j>i;j--){
                        a[j]=a[j-1];
                    }
                    this.a[i]=value;
                    this.nElems++;
                    return;
                }
            }
            this.a[this.nElems]=value;
            this.nElems++;
        }
    }
    
    
    
   /* public boolean delete (long value) {      //while loop1k athule find method1 -1 return karnakal kalin 1e delete method 1 while loop 1e danna
        if(this.size()==0){
            System.out.println("Nothing to delete");
        }
        else{
            if(this.find(value)==-1){
            System.out.println("value is not there");
            }
            else{
            for(int j=this.find(value);j<this.nElems-1;j++){
                a[j]=a[j+1];
                this.nElems--;
                return true;
            }
            }
        }
        
        return false;
    } **/
    
    //for non duplicated
    /*public boolean delete (long value){
         for(int i=0;i<this.nElems;i++){
             if(a[i]==value){
                 for(int j=i;j<this.nElems-1;j++){
                     a[j]=a[j+1];
                 }
                 this.nElems--;
                 return true;
             }
         }
         return false;
    }*/
    
    
    public boolean delete (long value){
        if(this.size()==0){
           System.out.println("Array is empty");
        }

        boolean status=false;
         
        for(int i=0;i<this.nElems;i++){
            if(a[i]==value){
                for(int j=i;j<this.nElems-1;j++){
                    a[j]=a[j+1];
                }
                this.nElems--;
                i--; //(as the example)loop 1, 2ta yaddi duplicate 1e thibba 2 miss wenawa eka nethi karala 2 salakanna manually 1k adu krnawa for loop 1e increase una 1 adu karaganna
                status=true;
            }
        }
       return status;
    }
    
    
    public void display(){
        for(int i=0;i<nElems;i++){
            System.out.print( a[i]+" " );
        }
        System.out.println();
    }
}
