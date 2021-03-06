package org.firezenk.naviganto.library;

import javax.annotation.Nonnull;

/**
 * Project: Naviganto
 *
 * Created by Jorge Garrido Oval, aka firezenk on 26/10/16.
 * Copyright © Jorge Garrido Oval 2016
 */
public class ParameterNotFoundException extends Exception {

    public ParameterNotFoundException(@Nonnull String message) {
        super(message);
    }
}
