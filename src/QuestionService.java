public class QuestionService {
    Questions[] questions=new Questions[4];
    public QuestionService(){
        questions[0]=new Questions(1,"Test1","Answer1","opt1","opt2","opt3","opt4");
        questions[1]=new Questions(2,"Test2","Answer2","opt1","opt2","opt3","opt4");
        questions[2]=new Questions(3,"Test3","Answer3","opt1","opt2","opt3","opt4");
        questions[3]=new Questions(4,"Test4","Answer4","opt1","opt2","opt3","opt4");
    }
    public void displayQuestion(){
        for(Questions q: questions){
            System.out.println(q.toString());
        }
    }


}
