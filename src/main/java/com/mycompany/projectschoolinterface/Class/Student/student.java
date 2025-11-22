package com.mycompany.projectschoolinterface.Class.Student;

import com.mycompany.projectschoolinterface.Class.superClass;
import com.mycompany.projectschoolinterface.Constantes.statusNota;

import java.util.ArrayList;
import java.util.Objects;

public class student extends superClass {
    private String nomeMae;
    private String cpfMae;
    private String nomePai;
    private String cpfPai;

    private ArrayList<Discipline> disciplines = new ArrayList<>();

// ================== Getters and Setters ==================]
    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public ArrayList<Discipline> getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(ArrayList<Discipline> disciplines) {
        this.disciplines = disciplines;
    }

    public String getCpfMae() {
        return cpfMae;
    }

    public void setCpfMae(String cpfMae) {
        this.cpfMae = cpfMae;
    }

    public String getCpfPai() {
        return cpfPai;
    }

    public void setCpfPai(String cpfPai) {
        this.cpfPai = cpfPai;
    }

    // ================== Getters and Setters ==================

// ================== HashCode and Equals ==================

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        student student = (student) o;
        return Objects.equals(nomeMae, student.nomeMae) && Objects.equals(cpfMae, student.cpfMae) && Objects.equals(nomePai, student.nomePai) && Objects.equals(cpfPai, student.cpfPai) && Objects.equals(disciplines, student.disciplines);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nomeMae, cpfMae, nomePai, cpfPai, disciplines);
    }

// ================== HashCode and Equals ==================

// ================== ToString ==================
    @Override
    public String toString() {
        return "student{" +
                "nomeMae='" + nomeMae + '\'' +
                ", cpfMae='" + cpfMae + '\'' +
                ", nomePai='" + nomePai + '\'' +
                ", cpfPai='" + cpfPai + '\'' +
                ", disciplines=" + disciplines +
                '}';
    }

// ================== ToString ==================

    public Double getResultadoNota(){
        Double nota = 0.0;
        nota += disciplines.getFirst().geSomaNota();
        return nota;
    }

    public String getStatusNota(){
        Double nota = this.getResultadoNota();
        if(nota >=70){
            return statusNota.APROVADO;
        }if(nota >=50){
            return statusNota.RECUPERACAO;
        }else{
            return statusNota.REPROVADO;
        }
    }

}
