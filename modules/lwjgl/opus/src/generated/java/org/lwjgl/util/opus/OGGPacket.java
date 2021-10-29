/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.opus;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ogg_packet {
 *     unsigned char * packet;
 *     long bytes;
 *     long b_o_s;
 *     long e_o_s;
 *     ogg_int64_t granulepos;
 *     ogg_int64_t {@link #packetno};
 * }</code></pre>
 */
@NativeType("struct ogg_packet")
public class OGGPacket extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PACKET,
        BYTES,
        B_O_S,
        E_O_S,
        GRANULEPOS,
        PACKETNO;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PACKET = layout.offsetof(0);
        BYTES = layout.offsetof(1);
        B_O_S = layout.offsetof(2);
        E_O_S = layout.offsetof(3);
        GRANULEPOS = layout.offsetof(4);
        PACKETNO = layout.offsetof(5);
    }

    /**
     * Creates a {@code OGGPacket} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OGGPacket(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code packet} field. */
    @NativeType("unsigned char *")
    public ByteBuffer packet() { return npacket(address()); }
    /** @return the value of the {@code bytes} field. */
    public long bytes() { return nbytes(address()); }
    /** @return the value of the {@code b_o_s} field. */
    public long b_o_s() { return nb_o_s(address()); }
    /** @return the value of the {@code e_o_s} field. */
    public long e_o_s() { return ne_o_s(address()); }
    /** @return the value of the {@code granulepos} field. */
    @NativeType("ogg_int64_t")
    public long granulepos() { return ngranulepos(address()); }
    /**
     * sequence number for decode; the framing knows where there's a hole in the data, but we need coupling so that the codec (which is in a separate
     * abstraction layer) also knows about the gap
     */
    @NativeType("ogg_int64_t")
    public long packetno() { return npacketno(address()); }

    // -----------------------------------

    /** Returns a new {@code OGGPacket} instance for the specified memory address. */
    public static OGGPacket create(long address) {
        return wrap(OGGPacket.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OGGPacket createSafe(long address) {
        return address == NULL ? null : wrap(OGGPacket.class, address);
    }

    /**
     * Create a {@link OGGPacket.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OGGPacket.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OGGPacket.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #packet() packet}. */
    public static ByteBuffer npacket(long struct) { return memByteBuffer(memGetAddress(struct + OGGPacket.PACKET), (int)nbytes(struct)); }
    /** Unsafe version of {@link #bytes}. */
    public static long nbytes(long struct) { return memGetCLong(struct + OGGPacket.BYTES); }
    /** Unsafe version of {@link #b_o_s}. */
    public static long nb_o_s(long struct) { return memGetCLong(struct + OGGPacket.B_O_S); }
    /** Unsafe version of {@link #e_o_s}. */
    public static long ne_o_s(long struct) { return memGetCLong(struct + OGGPacket.E_O_S); }
    /** Unsafe version of {@link #granulepos}. */
    public static long ngranulepos(long struct) { return UNSAFE.getLong(null, struct + OGGPacket.GRANULEPOS); }
    /** Unsafe version of {@link #packetno}. */
    public static long npacketno(long struct) { return UNSAFE.getLong(null, struct + OGGPacket.PACKETNO); }

    // -----------------------------------

    /** An array of {@link OGGPacket} structs. */
    public static class Buffer extends StructBuffer<OGGPacket, Buffer> {

        private static final OGGPacket ELEMENT_FACTORY = OGGPacket.create(-1L);

        /**
         * Creates a new {@code OGGPacket.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OGGPacket#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected OGGPacket getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code packet} field. */
        @NativeType("unsigned char *")
        public ByteBuffer packet() { return OGGPacket.npacket(address()); }
        /** @return the value of the {@code bytes} field. */
        public long bytes() { return OGGPacket.nbytes(address()); }
        /** @return the value of the {@code b_o_s} field. */
        public long b_o_s() { return OGGPacket.nb_o_s(address()); }
        /** @return the value of the {@code e_o_s} field. */
        public long e_o_s() { return OGGPacket.ne_o_s(address()); }
        /** @return the value of the {@code granulepos} field. */
        @NativeType("ogg_int64_t")
        public long granulepos() { return OGGPacket.ngranulepos(address()); }
        /** @return the value of the {@link OGGPacket#packetno} field. */
        @NativeType("ogg_int64_t")
        public long packetno() { return OGGPacket.npacketno(address()); }

    }

}