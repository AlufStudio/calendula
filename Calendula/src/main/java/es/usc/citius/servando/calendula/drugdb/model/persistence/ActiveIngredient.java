package es.usc.citius.servando.calendula.drugdb.model.persistence;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * This class was generated automatically.
 * Please check consistency and completion.
 * Replace {} with the appropriate classes and generate methods as needed.
 */
@DatabaseTable(tableName = "ActiveIngredient")
public class ActiveIngredient {

    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_ACTIVE_INGREDIENT_CODE = "ActiveIngredientCode";
    public static final String COLUMN_ACTIVE_INGREDIENT_ID = "ActiveIngredientID";
    public static final String COLUMN_NAME = "Name";

    /**
     * Autogenerated ID
     */
    @DatabaseField(columnName = COLUMN_ID, generatedId = true)
    private Long id;
    @DatabaseField(columnName = COLUMN_ACTIVE_INGREDIENT_CODE)
    private String activeIngredientCode;
    @DatabaseField(columnName = COLUMN_ACTIVE_INGREDIENT_ID)
    private Long activeIngredientID;
    @DatabaseField(columnName = COLUMN_NAME)
    private String name;

    /**
     * Empty constructor, required by ORMLite
     */
    public ActiveIngredient() {
    }

    public ActiveIngredient(String activeIngredientCode, Long activeIngredientID, String name) {
        this.activeIngredientCode = activeIngredientCode;
        this.activeIngredientID = activeIngredientID;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getActiveIngredientCode() {
        return activeIngredientCode;
    }

    public void setActiveIngredientCode(String activeIngredientCode) {
        this.activeIngredientCode = activeIngredientCode;
    }

    public Long getActiveIngredientID() {
        return activeIngredientID;
    }

    public void setActiveIngredientID(Long activeIngredientID) {
        this.activeIngredientID = activeIngredientID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
