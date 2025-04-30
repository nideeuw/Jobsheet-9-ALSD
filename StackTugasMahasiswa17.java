public class StackTugasMahasiswa17 {
    Mahasiswa17[] stack;
    int size, top;

    public StackTugasMahasiswa17(int size) {
        this.size = size;
        stack = new Mahasiswa17[size];
        top = -1;
    }
    public boolean isFull(){
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isEmpty(){
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
    public void push(Mahasiswa17 mhs){
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        }else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }
    public Mahasiswa17 pop(){
        if (!isEmpty()) {
            return stack[top--];
        }else {
            return null;
        }
    }
    public Mahasiswa17 peek(){
        if (!isEmpty()) {
            return stack[top];
        }else {
            return null;
        }
    }
    public void print(){
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }
}
