package jskno;

/**
 * Hello world!
 *
 */
public class ChildApp
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World From Child!" );
        MessageService messageService = new MessageService();
        System.out.println(messageService.getChildMessage());
    }
}
