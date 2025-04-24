public interface CalculaIdade {
    public void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {
        //Todo add your hedling code here:  
        int an =  Integer.parent(text.AN.getValue().toString());
        int id =  2015 - an;
        lblIdade.setText(Integer.toString(id));

    }
}
