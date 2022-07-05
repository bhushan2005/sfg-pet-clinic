package guru.springframework.model;

import java.time.LocalDate;

public class Pet extends BaseEntity {
    private PetType petTye;
    private Owner owner;
    private LocalDate birtdDate;

    public PetType getPetTye() {
        return petTye;
    }

    public void setPetTye(PetType petTye) {
        this.petTye = petTye;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirtdDate() {
        return birtdDate;
    }

    public void setBirtdDate(LocalDate birtdDate) {
        this.birtdDate = birtdDate;
    }
}
