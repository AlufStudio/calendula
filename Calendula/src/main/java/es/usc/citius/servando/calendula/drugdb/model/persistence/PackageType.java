package es.usc.citius.servando.calendula.drugdb.model.persistence;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * This class was generated automatically.
 * Please check consistency and completion.
 * Replace {} with the appropriate classes and generate methods as needed.
 */
@DatabaseTable(tableName = "PackageType")
public class PackageType {

    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_PACKAGE_TYPE_ID = "PackageTypeID";
    public static final String COLUMN_NAME = "name";

    /**
     * Autogenerated ID
     */
    @DatabaseField(columnName = COLUMN_ID, generatedId = true)
    private Long id;
    @DatabaseField(columnName = COLUMN_PACKAGE_TYPE_ID)
    private Long packageTypeID;
    @DatabaseField(columnName = COLUMN_NAME)
    private String name;

    /**
     * Empty constructor, required by ORMLite
     */
    public PackageType() {
    }

    public PackageType(Long packageTypeID, String name) {
        this.packageTypeID = packageTypeID;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPackageTypeID() {

        return packageTypeID;
    }

    public void setPackageTypeID(Long packageTypeID) {
        this.packageTypeID = packageTypeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
