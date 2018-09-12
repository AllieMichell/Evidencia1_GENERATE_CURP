package act3.app.com.evidencia1act4_android.Models;

import android.os.Parcel;
import android.os.Parcelable;

public class Cliente_CURP implements Parcelable {
    private String codigo;
    private String apellidop;
    private String apellidom;
    private String nombre;
    private String sexo;
    private String fechanD;
    private String fechanM;
    private String fechanA;
    private String entidadf;

    public Cliente_CURP(String codigo, String apellidop, String apellidom, String nombre, String sexo, String fechanD, String fechanM, String fechanA, String entidadf){
        this.codigo = codigo;
        this.apellidop = apellidop;
        this.apellidom = apellidom;
        this.nombre = nombre;
        this.sexo = sexo;
        this.fechanD = fechanD;
        this.fechanM = fechanM;
        this.fechanA = fechanA;
        this.entidadf = entidadf;
    }


    public String getCodigo() {
        return codigo;
    }

    public String getApellidop() {
        return apellidop;
    }

    public String getApellidom() {
        return apellidom;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public String getFechanD() {
        return fechanD;
    }

    public String getFechanM() {
        return fechanM;
    }

    public String getFechanA() {
        return fechanA;
    }

    public String getEntidadf() {
        return entidadf;
    }

    protected Cliente_CURP(Parcel in) {
        codigo = in.readString();
        apellidop = in.readString();
        apellidom = in.readString();
        nombre = in.readString();
        sexo = in.readString();
        fechanD = in.readString();
        fechanM = in.readString();
        fechanA = in.readString();
        entidadf = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(codigo);
        dest.writeString(apellidop);
        dest.writeString(apellidom);
        dest.writeString(nombre);
        dest.writeString(sexo);
        dest.writeString(fechanD);
        dest.writeString(fechanM);
        dest.writeString(fechanA);
        dest.writeString(entidadf);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Cliente_CURP> CREATOR = new Parcelable.Creator<Cliente_CURP>() {
        @Override
        public Cliente_CURP createFromParcel(Parcel in) {
            return new Cliente_CURP(in);
        }

        @Override
        public Cliente_CURP[] newArray(int size) {
            return new Cliente_CURP[size];
        }
    };
}