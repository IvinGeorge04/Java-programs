class LogicalOp
{
    public static void main(String args[])
    {
        String username,password;
        username="user1";
        password="pass123";
        if(username=="user1" && password=="pass123")
        {
            System.out.println("Authorized login Sucessful");
        }
        else if(username!="user1" && password=="pass123")
        {
            System.out.println("incorrect username");
        }
        else if(username=="user1" && password!="pass123")
        {
            System.out.println("incorrect password");
        }
        else 
        {
            System.out.println("both username and password are incorrect");
        }
    }
}