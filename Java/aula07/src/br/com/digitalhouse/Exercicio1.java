package br.com.digitalhouse;

class Exercicio1 {
    public static void main(String[] args) {
        Contrato contrato = new Contrato("Contrato Maroto", "cont");
        Documento documento = new Documento("Aluguel", "docx");
        Foto foto = new Foto("jantar-em-familia", "JPEG");

        Impressora impressora = new Impressora();
        impressora.adicionarImprimivel(contrato);
        impressora.adicionarImprimivel(documento);
        impressora.adicionarImprimivel(foto);

        impressora.imprimirTudo();
    }
}
