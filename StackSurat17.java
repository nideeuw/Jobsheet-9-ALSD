public class StackSurat17 {
    Surat17[] stack;
    int top;

    public StackSurat17(int size) {
        stack = new Surat17[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }

    public void push(Surat17 surat) {
        if (!isFull()) {
            stack[++top] = surat;
        } else {
            System.out.println("Stack penuh. Tidak dapat menerima surat baru.");
        }
    }

    public Surat17 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat17 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            return null;
        }
    }

    // search menggunakan sequential search
    public boolean cariSurat(String namaMahasiswa) {
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(namaMahasiswa)) {
                System.out.println("ID Surat        : " + stack[i].idSurat);
                System.out.println("Nama Mahasiswa  : " + stack[i].namaMahasiswa);
                System.out.println("Kelas           : " + stack[i].kelas);
                System.out.println("Jenis Izin      : " + (stack[i].jenisIzin == 'S' ? "Sakit" : "Izin Lain"));
                System.out.println("Durasi Izin     : " + stack[i].durasi + " hari");
                return true;
            }
        }
        return false;
    }
}
