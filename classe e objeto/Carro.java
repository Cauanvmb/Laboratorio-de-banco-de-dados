public class Carro {
       private String placa;
        private int velocidade;
        private String motorista;
    
        public Carro(String placa, int velocidade, String motorista){
            this.placa = placa;
            this.velocidade = velocidade;
            this.motorista = motorista;
    
        }
        public String getPlaca(){
            return placa;
        }
        public int getVelocidade(){
            return velocidade;
        }
        public String getMotorista(){
            return motorista;
        }
        public void setPlaca(String placa) {
            this.placa = placa;
        }
        public void setVelocidade(int velocidade) {
            this.velocidade = velocidade;
        }
        public void setMotorista(String motorista) {
            this.motorista = motorista;
        }
        public void dirigir() {
            System.out.println("Ligou o carro e está dirigindo");
        }
        
        public void freiada() {
            System.out.println("freio o carro bruscamente");
        }
        
        public void alarme() {
            System.out.println("ativou o alarme");
        }
    }    
 