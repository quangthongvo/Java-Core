import java.nio.charset.StandardCharsets;

public class IoStreamDemo {
    public static void main(String[] args) {
     String path = "src/main/resources/abc.txt";
     byte [] bytes = "java core".getBytes(StandardCharsets.UTF_8);
     IoManager.writeFile(path, bytes, true);
     IoManager.writeFile(path, bytes, true);
     IoManager.writeFile(path, bytes, false);

     byte [] output = IoManager.readFile(path);
     String content = new String(output);
        System.out.println(content);

        Account account = new Account(1, "thongvq", "12345");
        IoManager.writeObject(path, account, false);
        Account saveAccount = (Account) IoManager.readObject(path);
        System.out.println(saveAccount);

    }
}
