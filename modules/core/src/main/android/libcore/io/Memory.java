/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package libcore.io;

/**
 * Unsafe access to memory.
 */
public final class Memory {

    private Memory() {
    }

    public static native byte peekByte(long address);
    public static short peekShort(long address, boolean swap)             { return 0; }
    public static int peekInt(long address, boolean swap)                 { return 0; }
    public static long peekLong(long address, boolean swap)               { return 0L; }

    public static native void pokeByte(long address, byte value);
    public static void pokeShort(long address, short value, boolean swap) {}
    public static void pokeInt(long address, int value, boolean swap)     {}
    public static void pokeLong(long address, long value, boolean swap)   {}
}