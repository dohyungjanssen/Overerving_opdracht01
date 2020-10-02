package nl.novi.javaprogrammeren.overerving;

public abstract class Pet extends Animal {

    private String ownerFullName;
    private String favouriteFoodBrand;
    private String subSpeciesName;

    public String getOwnerFullName() {
        return ownerFullName;
    }

    public void setOwnerFullName(String ownerFullName) {
        this.ownerFullName = ownerFullName;
    }

    public String getFavouriteFoodBrand() {
        return favouriteFoodBrand;
    }

    public void setFavouriteFoodBrand(String favouriteFoodBrand) {
        this.favouriteFoodBrand = favouriteFoodBrand;
    }

    public String getSubSpeciesName() {
        return subSpeciesName;
    }

    public void setSubSpeciesName(String subSpeciesName) {
        this.subSpeciesName = subSpeciesName;
    }
}
