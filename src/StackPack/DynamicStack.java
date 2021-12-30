package StackPack;

public class DynamicStack extends Stack{
    @Override
    public void push(int item) throws Exception {
        if(isFull()){
            int temp[] = new int[2* this.data.length];
            for (int i = 0; i < this.data.length; i++) {
                temp[i] = this.data[i];
            }
            this.data = temp;
        }
        super.push(item);
    }
}
