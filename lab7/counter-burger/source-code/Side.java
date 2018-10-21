public class Side extends LeafDecorator
{
    private String[] options ;
    
    
    public Side( String d )
    {
        super(d) ;
    }
    
    // 1 cheese free, extra cheese +1.00
    public void setOptions( String[] options )
    {
        this.options = options ;
        for ( int i = 0; i<options.length; i++ )
        {
            if ( "Shoestring Fries".equals(options[i]) ) this.price += 7.50 ;
            if ("1/2lb".equals(options[i]) ) this.price += 12.00;
            if ( "2/3lb.".equals(options[i]) ) this.price += 11.50 ;
            if ( "1lb.".equals(options[i]) ) this.price += 15.50 ;
            if ( "In A Bowl".equals(options[i]) ) this.price += 1.50 ;
            if ( "Organic Bison*".equals(options[i]) ) { this.price += 4.00 ;
            System.out.println(this.price);
            }
            
        }
    }
    
    public String getDescription() 
    {
        String desc = "   " ;
        for ( int i = 0; i<options.length; i++ )
        {
            if (i>0) desc += " + " + options[i] ;
            else desc = options[i] ;
        }        
        return desc ;
    }
    
}
