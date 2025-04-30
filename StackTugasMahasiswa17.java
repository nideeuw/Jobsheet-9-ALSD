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
    // code sebelum diubah
    // public void print(){
    //     for (int i = 0; i <= top; i++) {
    //         System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
    //     }
    //     System.out.println("");
    // }
    
    // code setelah diubah supaya persis seperti soal
    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }
    // melihat mahasiswa yang pertama kali mengumpulkan tugas melalui operasi lihat tugas terbawah
    public Mahasiswa17 bottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            return null;
        }
    }
    // menghitung jumlah tugas yang dikumpulkan saat ini
    public int jumlahTugas() {
        return top + 1;
    }

    // menambahkan method untuk soal percobaan 2
    public String konversiDesimalKeBiner(int nilai){
        StackKonversi17 stack = new StackKonversi17();
        while(nilai > 0){
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while(!stack.isEmpty()){
            biner += stack.pop();
        }
        return biner;
    }
}
