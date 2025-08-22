package exceptionhandling;

public class Exceptionhandlingthrows {

	public static void main(String[] args) throws VotingException {
		int age =12;
		if(age>=18)
		{
			System.out.println("eligible to vote");
		}
		else
		{
			throw new VotingException("not valid for voting");
		}
	}

}
