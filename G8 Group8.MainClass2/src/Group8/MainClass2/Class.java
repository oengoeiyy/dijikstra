package Group8.MainClass2;

public class Class {
    private int minn;
    private int minad;
    private int min;
    
    public void min(int min){
        
        this.min = min;
    }
    
    public int getmin(){
        
        return min;
    }
    
    public void minn(int minn){
        
        this.minn = minn;
    }
    
    public int getminn(){
        
        return minn;
    }
    
    public void minad(int minad){
        
        this.minad = minad;
    }
    
    public int getminad(){
        
        return minn;
    }
    
    public int findindex(int m,int[] n){
        int index = 0;
        int i = 0;
        boolean chk = false;
        for(i=0;i<n.length;i++){
            if(n[i] == m) {
                index = i;
                chk = true;        
            }
            if(chk) break;
        }
        return index;
    }
}
