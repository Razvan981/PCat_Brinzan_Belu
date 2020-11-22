package astClasses;

public class ProcedureDeclaration extends ProcedureDeclList{
	FormalParams formalParams;
	Body body;
	Typename typename;
	ProcedureParams procedureParams;
	
	public ProcedureDeclaration(FormalParams formalParams, Typename typename, Body body) {
		this.formalParams = formalParams;
		this.typename = typename;
		this.body = body;
	}
	
	public ProcedureDeclaration(ProcedureParams procedureParams, Body body) {
			this.procedureParams = procedureParams;
			this.body = body;
	}
	
	public ProcedureDeclaration(ProcedureParams procedureParams, Typename typename, Body body) {
		this.procedureParams = procedureParams;
		this.typename = typename;
		this.body = body;
	}
	
	public void print() {
		System.out.println("Procedure Declaration");
		
		if(formalParams != null) {
			formalParams.print();
		}
		
		if(body != null) {
			body.print();
		}
		
		if(typename != null) {
			typename.print();
		}
		
		if(procedureParams != null) {
			procedureParams.print();
		}
	}
}
