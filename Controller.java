package sample;


import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import static java.lang.Math.*;


public  class Controller  {
    String oldText;
    double num1=0,ans=0;
    boolean ok=true;
    int check=0,lastoperator=0,off=0;
    @FXML
    TextField screen;
    @FXML
    public void button_cos_action(ActionEvent actionEvent) {
        if(off==1)
            return ;
        String str=screen.getText();
        String str1=((Button)actionEvent.getSource()).getText();
        lastoperator=-1;
        for(int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '×' || str.charAt(i) == '÷')
            {
                lastoperator=i;
                break;
            }
        }
        String parcent=str.substring(lastoperator+1);
        str+=str1;
        screen.setText(str);
        if(parcent.isEmpty())
        {
            screen.setText("Syntext Error.click AC button.");
            return;
        }
        ok=false;
        double pii=Double.parseDouble(parcent);
        pii=Math.toRadians(pii);
        pii=cos(pii);
        parcent=Double.toString(pii);
        str=str.substring(0,lastoperator+1)+parcent;
        screen.setText(str);
    }
    @FXML
    public void button_sin_action(ActionEvent actionEvent) {
        if(off==1)return ;
        String str=screen.getText();
        String str1=((Button)actionEvent.getSource()).getText();
        lastoperator=-1;
        for(int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '×' || str.charAt(i) == '÷')
            {
                lastoperator=i;
                break;
            }
        }
        String parcent=str.substring(lastoperator+1);
        str+=str1;
        screen.setText(str);
        if(parcent.isEmpty())
        {
            screen.setText("Syntext Error.click AC button.");
            return;
        }
        ok=false;
        double pii=Double.parseDouble(parcent);
        pii=Math.toRadians(pii);
        pii=sin(pii);
        parcent=Double.toString(pii);
        str=str.substring(0,lastoperator+1)+parcent;
        screen.setText(str);
    }
    @FXML
    public void button_log_action(ActionEvent actionEvent) {
        if(off==1) return ;
        String str=screen.getText();
        String str1=((Button)actionEvent.getSource()).getText();
        lastoperator=-1;
        for(int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '×' || str.charAt(i) == '÷')
            {
                lastoperator=i;
                break;
            }
        }
        String parcent=str.substring(lastoperator+1);
        str+=str1;
        screen.setText(str);
        if(parcent.isEmpty())
        {
            screen.setText("Syntext Error.click AC button.");
            return;
        }
        ok=false;
        double pii=Double.parseDouble(parcent);
        pii=log10(pii);
        parcent=Double.toString(pii);
        str=str.substring(0,lastoperator+1)+parcent;
        screen.setText(str);
    }
    @FXML
    public void button_on_action(ActionEvent actionEvent) {
        off=0;
        screen.setText("");
        num1=0;
    }
    @FXML
    public void button_root_action(ActionEvent actionEvent) {
        if(off==1)
            return ;
        String str=screen.getText();
        String str1=((Button)actionEvent.getSource()).getText();
        lastoperator=-1;
        for(int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '×' || str.charAt(i) == '÷')
            {
                lastoperator=i;
                break;
            }
        }
        String parcent=str.substring(lastoperator+1);
        str+=str1;
        screen.setText(str);
        if(parcent.isEmpty())
        {
            screen.setText("Syntext Error.click AC button.");
            return;
        }
        ok=false;
        double pii=Double.parseDouble(parcent);
        pii=sqrt(pii);
        parcent=Double.toString(pii);
        str=str.substring(0,lastoperator+1)+parcent;
        screen.setText(str);
    }



    @FXML
    public void button_cuberoot_action(ActionEvent actionEvent) {
        if(off==1)
            return ;
        String str=screen.getText();
        String str1=((Button)actionEvent.getSource()).getText();
        lastoperator=-1;
        for(int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '×' || str.charAt(i) == '÷')
            {
                lastoperator=i;
                break;
            }
        }
        String parcent=str.substring(lastoperator+1);
        str+=str1;
        screen.setText(str);
        if(parcent.isEmpty())
        {
            screen.setText("Syntext Error.click AC button.");
            return;
        }
        ok=false;
        double pii=Double.parseDouble(parcent);
        pii=(pii*pii);
        parcent=Double.toString(pii);
        str=str.substring(0,lastoperator+1)+parcent;
        screen.setText(str);
    }
    @FXML
    public void buttton_factorial_action(ActionEvent actionEvent) {
        if(off==1)
            return ;
        String str=screen.getText();
        String str1=((Button)actionEvent.getSource()).getText();
        lastoperator=-1;
        for(int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '×' || str.charAt(i) == '÷')
            {
                lastoperator=i;
                break;
            }
        }
        String parcent=str.substring(lastoperator+1);
        str+=str1;
        screen.setText(str);
        if(parcent.isEmpty())
        {
            screen.setText("Syntext Error.click AC button.");
            return;
        }
        ok=false;
        double pii=Double.parseDouble(parcent);
        double res=1;
        for(int i=1;i<=pii;i++)
        {
            res*=i;
        }
            parcent=Double.toString(res);
        str=str.substring(0,lastoperator+1)+parcent;
        screen.setText(str);
    }
    @FXML
    public void button_div_action(ActionEvent actionEvent) {
        if(off==1)
            return ;
        String str=screen.getText();
        String str1=((Button)actionEvent.getSource()).getText();
        str+=str1;
        screen.setText(str);
        ok=true;
        lastoperator=str.length()-1;

    }
    @FXML
    public void button_multiply(ActionEvent actionEvent) {
        if(off==1)return ;
        String str=screen.getText();
        String str1=((Button)actionEvent.getSource()).getText();
        str+=str1;
        screen.setText(str);
        ok=true;
        lastoperator=str.length()-1;

    }
    @FXML
    public void button_minus_action(ActionEvent actionEvent) {
        if(off==1)
            return ;
        String str=screen.getText();
        String str1=((Button)actionEvent.getSource()).getText();
        str+=str1;
        screen.setText(str);
        ok=true;
        lastoperator=str.length()-1;

    }
    @FXML
    public void button_plus_action(ActionEvent actionEvent) {
        if(off==1)
            return ;
        String str=screen.getText();
        String str1=((Button)actionEvent.getSource()).getText();
        str+=str1;
        screen.setText(str);
        ok=true;
        lastoperator=str.length()-1;
    }
    @FXML
    public void button_equal_action(ActionEvent actionEvent) {
        if(off==1)
            return ;
        ok=false;
        lastoperator=0;
        String main_str=screen.getText();
        screen.clear();
        int[] ara=new int[100];
        int cnt_idx=0;
        ara[cnt_idx]=0;
        cnt_idx++;
        for(int i=1;i<main_str.length();i++) {
            if (main_str.charAt(i) == '+' || main_str.charAt(i) == '-' || main_str.charAt(i) == '×' || main_str.charAt(i) == '÷') {
                ara[cnt_idx] = i;
                cnt_idx++;
            }
        }
        ara[cnt_idx]=main_str.length();
        if(main_str.charAt(ara[0])=='×'||main_str.charAt(ara[0])=='÷'||(cnt_idx>0&&ara[cnt_idx-1]==main_str.length()-1))
        {
            screen.setText("Syntext Error.click AC button.");
            num1=0;
            return ;
        }
        else
        {
            num1=Double.parseDouble(main_str.substring(ara[0],ara[1]));
            for(int i=2;i<=cnt_idx;i++)
            {
                String sss=main_str.substring(ara[i-1]+1,ara[i]);

                //task of bracket
                //completing the task of bracket


                //the task of trigonometric function
                //completing the task of trigonometric function


                //checking dot
                int cnt_dot=0;
                for(int j=0;j<sss.length();j++)
                {
                    if(sss.charAt(j)=='.')
                        cnt_dot++;
                }
                if(cnt_dot>1)
                {
                    screen.setText("Syntext Error.click AC button.");
                    num1=0;
                    return ;
                }
                //completing checking dot-dont need to fixing


                //setting num2
                double num2;
                if(!sss.isEmpty())
                num2=Double.parseDouble(sss);
                else
                {
                    num2=0;
                    //need to fix
                    if((main_str.charAt(ara[i-1])=='-'&&main_str.charAt(ara[i])=='+'))
                    {
                       main_str=main_str.substring(0,ara[i])+"-"+main_str.substring(ara[i]+1);
                    }
                    else
                    {

                        if(main_str.charAt(ara[i-1])=='×'||main_str.charAt(ara[i-1])=='÷'||main_str.charAt(ara[i])=='×'||main_str.charAt(ara[i])=='÷')
                        {
                            screen.setText("Syntext Error.click AC button.");
                            num1=0;
                            return ;
                        }
                        // need to fixing
                    }

                }
                //completing for num2

                //operation
                if(main_str.charAt(ara[i-1])=='+')
                {
                    num1+=num2;
                }
                if(main_str.charAt(ara[i-1])=='-')
                {
                    num1-=num2;
                }
                if(main_str.charAt(ara[i-1])=='×')
                {
                    num1*=num2;
                }
                if(main_str.charAt(ara[i-1])=='÷')
                {
                    num1 /= num2;
                }
                //operation
            }
            screen.setText(Double.toString(num1));
            ans=num1;
            num1=0;
        }

    }
    @FXML
    public void button_off_action(ActionEvent actionEvent) {
        off=1;
        screen.setText("");
        num1=0;
    }
    @FXML
    public void button_ac_action(ActionEvent actionEvent) {
        screen.clear();
    }
    @FXML
    public void button_del_action(ActionEvent actionEvent) {
        if(off==1)return ;
        String oldText=screen.getText();
        oldText=oldText.substring(0,oldText.length()-1);
        screen.setText(oldText);
        ok=true;

    }
    @FXML
    public void button_number_action(ActionEvent actionEvent) {
        if(off==1)return ;
        if(ok)
        oldText=screen.getText();
        else
        {
            oldText="";
            ok=true;
        }
        String newText=((Button)actionEvent.getSource()).getText();
        oldText+=newText;
        screen.setText(oldText);
    }
    public void button_pi_action(ActionEvent actionEvent) {
        if(off==1)return ;
        String str=screen.getText();
        String str1=((Button)actionEvent.getSource()).getText();
        lastoperator=-1;
        for(int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '×' || str.charAt(i) == '÷')
            {
                lastoperator=i;
                break;
            }
        }
        String pi=str.substring(lastoperator+1);
        str+=str1;
        screen.setText(str);
        if(pi.isEmpty())
        {
            screen.setText(str.substring(0,lastoperator+1)+"3.14159");
            return;
        }
        ok=false;
        double pii=Double.parseDouble(pi);
        pii*=3.14159;
        pi=Double.toString(pii);
        str=str.substring(0,lastoperator+1)+pi;
        screen.setText(str);

    }

    public void button_parcent(ActionEvent actionEvent) {
        if(off==1)return ;
        String str=screen.getText();
        String str1=((Button)actionEvent.getSource()).getText();
        lastoperator=-1;
        for(int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '×' || str.charAt(i) == '÷')
            {
                lastoperator=i;
                break;
            }
        }
        String parcent=str.substring(lastoperator+1);
        str+=str1;
        screen.setText(str);
        if(parcent.isEmpty())
        {
            screen.setText("Syntext Error.click AC button.");
            return;
        }
        ok=false;
        double pii=Double.parseDouble(parcent);
        pii/=100;
        parcent=Double.toString(pii);
        str=str.substring(0,lastoperator+1)+parcent;
        screen.setText(str);
    }

    public void button_rem(ActionEvent actionEvent) {
        if(off==1)return ;
        String str=screen.getText();
        String str1=((Button)actionEvent.getSource()).getText();
        str+=str1;
        screen.setText(str);
        ok=true;
        lastoperator=str.length()-1;
    }

    public void button_ans_action(ActionEvent actionEvent) {
        if(off==1)return ;
        screen.setText(Double.toString(ans));
    }

    public void button_tan_action(ActionEvent actionEvent) {
        if(off==1)return;
        String str=screen.getText();
        String str1=((Button)actionEvent.getSource()).getText();
        lastoperator=-1;
        for(int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '×' || str.charAt(i) == '÷')
            {
                lastoperator=i;
                break;
            }
        }
        String parcent=str.substring(lastoperator+1);
        str+=str1;
        screen.setText(str);
        if(parcent.isEmpty())
        {
            screen.setText("Syntext Error.click AC button.");
            return;
        }
        ok=false;
        double pii=Double.parseDouble(parcent);
        pii=Math.toRadians(pii);
        pii=tan(pii);
        parcent=Double.toString(pii);
        str=str.substring(0,lastoperator+1)+parcent;
        screen.setText(str);
    }
}
