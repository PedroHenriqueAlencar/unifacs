public class MyClass {
    public static void main(String args[]) {
        int qnt,i,x,y,z;
        qnt = 15
        //insira a quantidade de alturas que será calculada (valor de qnt);
        while(i < qnt)
        {
            //insira o valor de y (idade);
            y++;
            if (y < x)
            {
                x = y;
            }
            else if (y > z)
            {
                z = y;
            }
            else if (x == 0 && z == 0)
            {
                if (y == x && y == z)
                {
                    x = z = y;
                }
                else
                {
                    z = y;
                }
            }
            i++;
        }
    }
}
