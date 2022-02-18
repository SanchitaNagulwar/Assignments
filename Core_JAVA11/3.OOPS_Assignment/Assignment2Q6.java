package corejava;

abstract class Persistence{
    abstract public String Persist();
}

class FilePersistence extends Persistence{
    @Override
    public String Persist() {
        return "Persist method of File Persistence Method.";
    }
}

class DatabasePersistence extends Persistence{
    @Override
    public String Persist() {
        return "Persist method of Database Persistence Method.";
    }
}
public class Assignment2Q6 {
    public static void main(String[] args) {
   
        FilePersistence filePersistence = new FilePersistence();

        System.out.println(filePersistence.Persist());

        DatabasePersistence databasePersistence = new DatabasePersistence();
        System.out.println(databasePersistence.Persist());
    }
}
