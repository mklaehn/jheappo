package org.adoptopenjdk.jheappo.heapdump;

/*
 * Copyright (c) 2018 Kirk Pepperdine.
 * Licensed under https://github.com/AdoptOpenJDK/jheappo/blob/master/LICENSE
 * Instructions: https://github.com/AdoptOpenJDK/jheappo/wiki
 */


import org.adoptopenjdk.jheappo.io.HeapProfileRecord;

public class ControlSettings extends HeapProfileRecord {

    public final static int TAG = 0x0E;

    public ControlSettings(byte[] body) {
        super(body);
    }
}
