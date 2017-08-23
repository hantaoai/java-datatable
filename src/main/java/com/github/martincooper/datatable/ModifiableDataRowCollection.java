package com.github.martincooper.datatable;

import io.vavr.control.Try;

/**
 * ModifiableDataRowCollection. Handles a collection of DataRows
 * Created by Martin Cooper on 17/07/2017.
 */
public class ModifiableDataRowCollection extends DataRowCollection {

    /**
     * Private DataRow constructor.
     * Use 'build' to create instance.
     *
     * @param table The DataTable the DataRow is pointing to.
     * @param rows The DataRows.
     */
    private ModifiableDataRowCollection(DataTable table, Iterable<DataRow> rows) {
        super(table, rows);
    }

    /**
     * Returns a new DataTable with the additional row appended.
     *
     * @param rowValues The values to append to the row.
     * @return Returns a new DataTable with the row appended.
     */
    public Try<DataTable> add(Object[] rowValues) {
        return null;
    }

    /**
     * Builds a new DataRowCollection for the specified DataTable.
     * @param table The table to build the DataRowCollection for.
     * @return Returns the DataRowCollection.
     */
    public static ModifiableDataRowCollection build(DataTable table) {
        return buildRowCollection(table, ModifiableDataRowCollection::new);
    }
}
