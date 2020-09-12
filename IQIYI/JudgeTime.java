package IQIYI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
* 牛牛参加了一场考试,考试包括n道判断题,每做对一道题获得1分,牛牛考试前完全没有准备,所以考试只能看缘分了,牛牛在考试中一共猜测了t道题目的答案是"正确",其他的牛牛猜为"错误"。考试结束后牛牛知道实际上n道题中有a个题目的答案应该是"正确",
* 但是牛牛不知道具体是哪些题目,牛牛希望你能帮助他计算可能获得的最高的考试分数是多少。
* */
public class JudgeTime {

    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String[] strings=bf.readLine().split(" ");
        int num=Integer.parseInt(strings[0]);
        int yesNum=Integer.parseInt(strings[1]);
        int realYes=Integer.parseInt(strings[2]);
        System.out.println(Math.min(realYes,yesNum)+Math.min(num-yesNum,num-realYes));
    }
}
