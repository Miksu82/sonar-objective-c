/*
 * Sonar Objective-C Plugin
 * Copyright (C) 2012 OCTO Technology, Backelite
 * dev@sonar.codehaus.org
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */

package org.sonar.plugins.objectivec.violations.oclint;

/**
 * Created by gillesgrousset on 18/02/2016.
 */
public enum OCLintRuleSeverity {

    // Rules are priority
    // INFO = 0, MINOR = 1, MAJOR = 2, CRITICAL = 3, BLOCKER = 4

    INFO,
    MINOR,
    MAJOR,
    CRITICAL,
    BLOCKER;

    public static OCLintRuleSeverity valueOfInt(int ordinal) {
        return values()[ordinal];
    }
}
