
public class Principal {

	public static void main(String[] args) {
		
		FuncionarioVendas fv = new FuncionarioVendas("Aaaaaa", "Aaaaaa@amail.com", 1000.0, "Vendedor", 100.0);
		fv.efetuarVenda(100);
		System.out.println(fv.getValorTotalVendas());
		System.out.println(fv.getSalarioBase());
		fv.mostrarSalarioVendas();
		System.out.println("############");
		
		FuncionarioAdministrativo fa = new FuncionarioAdministrativo("Bbbbbbb", "Bbbbbbb@bmail.com", 580.0, "Auxiliar", "Monitores");
		System.out.println(fa.getSalarioBase());
		fa.mostrarSalarioAdmin();
		
		System.out.println("------------STORE--------------");
	
		System.out.println("####### FUNCIONÁRIOS ADMINISTRATIVOS ######");
		System.out.println(fa);
		System.out.println("#########################################");
		System.out.println("####### FUNCIONÁRIOS DE VENDAS ######");
		System.out.println(fv);
		
	}

}
