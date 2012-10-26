package it.blackcat.strutsdemo;

/** Simple Struts2 demo
 * Created by IntelliJ IDEA.
 * User: Roberto Girelli
 * Date: 26-ott-2011
 * Time: 17.53.52
 * To change this template use File | Settings | File Templates.
 */
import java.util.Calendar;
import com.opensymphony.xwork2.ActionSupport;

public class TimeAction extends ActionSupport{
  private static final long serialVersionUID = -4383906363325947941L;

  public String execute() throws Exception{
    Calendar cal = Calendar.getInstance();
    int ora = cal.get(Calendar.HOUR_OF_DAY);

    if (ora > 16 || ora < 5)
      return "nightTime";
    else
      return "dayTime";
  }
} 