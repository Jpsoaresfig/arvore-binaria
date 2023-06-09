package entities;

public class Student {
    private String name;
    private Long rgm;

    public Student() {
    }

    public Student(String name, Long rgm) {
        this.name = name;
        this.rgm = rgm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getRgm() {
        return rgm;
    }

    public void setRgm(Long rgm) {
        this.rgm = rgm;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((rgm == null) ? 0 : rgm.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (rgm == null) {
            if (other.rgm != null)
                return false;
        } else if (!rgm.equals(other.rgm))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return rgm + " - " + name;
    }
    
}
