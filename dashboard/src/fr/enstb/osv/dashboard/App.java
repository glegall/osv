/*
 * App.java
 *
 *
 * Copyright 2017 Institut Mines-Télécom
 *
 * This file is part of tb-osv-dashboard.
 *
 * tb-osv-dashboard is free software: you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option)
 * any later version.
 *
 * tb-osv-dashboard is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with tb-osv-dashboard. If not, see <http://www.gnu.org/licenses/>.
 */

package fr.enstb.osv.dashboard;

import java.io.IOException;

import javax.swing.SwingUtilities;

/**
 * @author guillaumelg
 *
 */
public class App {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			// Override
			public void run() {
				try {
					new MainWindow();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
	}

}
