package fr.treeptik.initiationjava;

public class TestException {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		String saisie ="A";
		
		try{
		Integer intSaisie = Integer.valueOf(saisie);
		}catch(NumberFormatException e){
			e.printStackTrace();
			throw new Exception("erreur dans le main" + e.getMessage());
			//throws  ApplicationException ae = new ApplicationException();
		}catch(Exception e){
			System.out.println("erreur saisie");
		}finally{
			System.out.println("finally");
		}

	}

}
