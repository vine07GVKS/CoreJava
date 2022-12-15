package operators;

public class logical_operator {
    public static void main(String[] args) {
        // only logical operator used
        int NoOfStudents = 60;
        int NoOfNoteBooks =500;
        int NoOfSubject = 8;
        int NoOfBatchs = 8;
        System.out.println("using NOT logic in AND operator ");
        System.out.println(!(NoOfStudents<=NoOfBatchs && NoOfNoteBooks>=NoOfStudents) );
        System.out.println("using NOT logic in OR operator ");
        System.out.println(!(NoOfStudents<=NoOfBatchs || NoOfNoteBooks>=NoOfStudents) );
        System.out.println("using AND logic operator ");
        System.out.println(NoOfStudents<=NoOfBatchs && NoOfNoteBooks>=NoOfStudents );
        System.out.println("using OR logic operator ");
        System.out.println(NoOfStudents<=NoOfBatchs || NoOfNoteBooks>=NoOfStudents);
    }
}
