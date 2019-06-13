
package Logic;
import java.util.Map;
import org.jpl7.*;

/**
 *
 * @author Danny
 */
public class consultas 
{
    private static String hechosSource = "src/Hechos/lista.pl";
    
    private Variable X;
    private Variable Y;
    
    
    public consultas()
    {
        try {
           // String loadHechos = "consult('"+hechosSource+"')";
        Query loadQuery = new Query("consult", new Term[]{new Atom(hechosSource)});
            if (!loadQuery.hasSolution()) {
                throw new Exception("No se pudo cargar el archivo");
            }
            
            X = new Variable("X");
            Y = new Variable("Y");
        } catch (Exception e) 
        {
            System.err.println("consultas: "+ e.toString());
        }
    }
    /*
    public String getStudentFather(String Student, String Father)
    {
        try 
        {
            if (Student.isEmpty()&& !Father.isEmpty()) 
            {
                Query FindStudent = new Query("padre", new Term[]{ new Atom(Father),X});
                Map<String, Term>[] Solutions = FindStudent.allSolutions();
                if (Solutions!=null) {
                    String result="";
                     for (int i = 0; i < Solutions.length; i++) 
                     {
                         result += Solutions[i].get("X")+", ";
                     }
                    return  result;
                }
            }else if (!Student.isEmpty()&& Father.isEmpty()) 
            {
                Query FindStudent = new Query("padre", new Term[]{X, new Atom(Student)});
                Map<String, Term>[] Solutions = FindStudent.allSolutions();
                if (Solutions!=null) {
                    String result="";
                     for (int i = 0; i < Solutions.length; i++) 
                     {
                         result += Solutions[i].get("X")+", ";
                     }
                    return  result;
                }
            }else if (!Student.isEmpty()&& !Father.isEmpty()) 
            {
                Query FindStudent = new Query("padre", new Term[]{ new Atom(Father), new Atom(Student)});
                    return  (FindStudent.hasSolution() ? "Si" : "No");
            }
             return  "";
        } catch (Exception e) {
             return  "";
        }
    }
    */
    public String getMultimedia(String Type, String Genre,int Year)
    {
        try 
        {
            Query FindAnime;
            if (!Type.equals("all")) 
            {
                if (Year!=0) {
                    FindAnime = new Query(Type, new Term[]{ X,new Atom(Genre),new org.jpl7.Integer(Year)});
                }else{
                    FindAnime = new Query(Type, new Term[]{ X,new Atom(Genre),new org.jpl7.Variable("_")});
                }
                Map<String, Term>[] Solutions = FindAnime.allSolutions();
                if (Solutions!=null) {
                    String result="";
                     for (int i = 0; i < Solutions.length; i++) 
                     {
                         result += Solutions[i].get("X")+",";
                     }
                     System.out.println(FindAnime.toString());
                    return  result;
                }
            }else{
                 if (Year!=0) {
                    FindAnime = new Query("checkAll", new Term[]{ X,new Atom(Genre),new org.jpl7.Integer(Year)});
                }else{
                    FindAnime = new Query("checkAll", new Term[]{ X,new Atom(Genre),new org.jpl7.Variable("_")});
                }
                Map<String, Term>[] Solutions = FindAnime.allSolutions();
                if (Solutions!=null) {
                    String result="";
                     for (int i = 0; i < Solutions.length; i++) 
                     {
                         result += Solutions[i].get("X")+",";
                     }
                    return  result;
                }
            }
             return  "";
        } catch (Exception e) {
             return  "";
        }
    }

    public String getGenres(String Type) {
        try {
            if (!Type.equals("all")) {
                Query FindGenres = new Query(Type, new Term[]{new Variable("_"), X, new Variable("_")});
                Map<String, Term>[] Solutions = FindGenres.allSolutions();
                if (Solutions != null) {
                    String result = "";
                    for (int i = 0; i < Solutions.length; i++) {
                        result += Solutions[i].get("X") + ",";
                    }
                    return result;
                }
            } else {
                Query FindAnime = new Query("allGenres", new Term[]{X});
                Map<String, Term>[] Solutions = FindAnime.allSolutions();
                if (Solutions != null) {
                    String result = "";
                    for (int i = 0; i < Solutions.length; i++) {
                        result += Solutions[i].get("X") + ",";
                    }
                    return result;
                }

            }
            return "";
        } catch (Exception e) {
             return  "";
        }
    }

    public String getbyValoracion(String Calificacion) {
        try {
            
                Query FindMovSer = new Query("review", new Term[]{X,new Atom(Calificacion)});
                Map<String, Term>[] Solutions = FindMovSer.allSolutions();
                System.out.println(FindMovSer.toString());
                if (Solutions != null) {
                    String result = "";
                    for (int i = 0; i < Solutions.length; i++) {
                        result += Solutions[i].get("X") + ",";
                    }
                    return result;
                }
            return "";
        } catch (Exception e) {
             return  "";
        }
    }
    
    public String getActors() {
        try {
            
                Query FindMovSer = new Query("actor", new Term[]{X});
                Map<String, Term>[] Solutions = FindMovSer.allSolutions();
                System.out.println(FindMovSer.toString());
                if (Solutions != null) {
                    String result = "";
                    for (int i = 0; i < Solutions.length; i++) {
                        result += Solutions[i].get("X") + ",";
                    }
                    return result;
                }
            return "";
        } catch (Exception e) {
             return  "";
        }
    }
    
    public String getDirectors() {
        try {
            
                Query FindMovSer = new Query("director", new Term[]{X});
                Map<String, Term>[] Solutions = FindMovSer.allSolutions();
                System.out.println(FindMovSer.toString());
                if (Solutions != null) {
                    String result = "";
                    for (int i = 0; i < Solutions.length; i++) {
                        result += Solutions[i].get("X") + ",";
                    }
                    return result;
                }
            return "";
        } catch (Exception e) {
             return  "";
        }
    }
    public String getColaboraciones(String Type,String Name) {
        try {
            if (Type.equals("act")) {
                Query FindMovSer = new Query("actuo_en", new Term[]{new Atom(Name), X});
                Map<String, Term>[] Solutions = FindMovSer.allSolutions();
                System.out.println(FindMovSer.toString());
                if (Solutions != null) {
                    String result = "";
                    for (int i = 0; i < Solutions.length; i++) {
                        result += Solutions[i].get("X") + ",";
                    }
                    return result;
                }
            } else {
                Query FindAnime = new Query("dirigio", new Term[]{new Atom(Name), X});
                Map<String, Term>[] Solutions = FindAnime.allSolutions();
                if (Solutions != null) {
                    String result = "";
                    for (int i = 0; i < Solutions.length; i++) {
                        result += Solutions[i].get("X") + ",";
                    }
                    return result;
                }

            }
            return "";
        } catch (Exception e) {
             return  "";
        }
    }
}
