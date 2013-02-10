/*
 * jGnash, a personal finance application
 * Copyright (C) 2001-2013 Craig Cavanaugh
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package jgnash.ui.reconcile;

import java.util.Date;

import jgnash.engine.Account;
import jgnash.engine.Transaction;

/**
 * @author Craig Cavanaugh
 *
 */
class DebitModel extends AbstractReconcileTableModel {

    private static final long serialVersionUID = -1719518895082299667L;

    DebitModel(final Account account, final Date openingDate) {
        super(account, openingDate);
    }

    @Override
    boolean isShowable(final Transaction t) {
        return t.getAmount(account).signum() < 0;
    }
}
