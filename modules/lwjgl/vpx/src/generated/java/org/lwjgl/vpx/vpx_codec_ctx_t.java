/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vpx;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Codec context structure
 *
 * All codecs \ref MUST support this context structure fully. In general,
 * this data should be considered private to the codec algorithm, and
 * not be manipulated or examined by the calling application. Applications
 * may reference the 'name' member to get a printable description of the
 * algorithm.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code name} &ndash; Printable interface name</li>
 * <li>{@code iface} &ndash; Interface pointers</li>
 * <li>{@code err} &ndash; Last returned error</li>
 * <li>{@code err_detail} &ndash; Detailed info, if available</li>
 * <li>{@code init_flags} &ndash; Flags passed at init time</li>
 * <li><em>&lt;union&gt;</em>
 * 
 * <ul>
 * <li>{@code dec} &ndash; Decoder Configuration Pointer</li>
 * <li>{@code enc} &ndash; Encoder Configuration Pointer</li>
 * </ul></li>
 * <li>{@code priv} &ndash; Algorithm private storage</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct vpx_codec_ctx_t {
 *     char const * name;
 *     vpx_codec_iface_t * iface;
 *     vpx_codec_err_t err;
 *     char const * err_detail;
 *     long init_flags;
 *     union {
 *         {@link vpx_codec_dec_cfg_t vpx_codec_dec_cfg_t} const * dec;
 *         {@link vpx_codec_enc_cfg_t vpx_codec_enc_cfg_t} const * enc;
 *         void const * raw;
 *     };
 *     vpx_codec_priv_t * priv;
 * }</code></pre>
 */
public class vpx_codec_ctx_t extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NAME,
        IFACE,
        ERR,
        ERR_DETAIL,
        INIT_FLAGS,
        DEC,
        ENC,
        RAW,
        PRIV;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(CLONG_SIZE),
            __union(
                __member(POINTER_SIZE),
                __member(POINTER_SIZE),
                __member(POINTER_SIZE)
            ),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NAME = layout.offsetof(0);
        IFACE = layout.offsetof(1);
        ERR = layout.offsetof(2);
        ERR_DETAIL = layout.offsetof(3);
        INIT_FLAGS = layout.offsetof(4);
        DEC = layout.offsetof(6);
        ENC = layout.offsetof(7);
        RAW = layout.offsetof(8);
        PRIV = layout.offsetof(9);
    }

    /**
     * Creates a {@code vpx_codec_ctx_t} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public vpx_codec_ctx_t(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /**
     * Returns a {@link ByteBuffer} view of the data pointed to by the {@code name} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("char const *")
    public ByteBuffer name(int capacity) { return nname(address(), capacity); }
    /** Returns the value of the {@code iface} field. */
    @NativeType("vpx_codec_iface_t *")
    public long iface() { return niface(address()); }
    /** Returns the value of the {@code err} field. */
    @NativeType("vpx_codec_err_t")
    public int err() { return nerr(address()); }
    /**
     * Returns a {@link ByteBuffer} view of the data pointed to by the {@code err_detail} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("char const *")
    public ByteBuffer err_detail(int capacity) { return nerr_detail(address(), capacity); }
    /** Returns the value of the {@code init_flags} field. */
    public long init_flags() { return ninit_flags(address()); }
    /** Returns a {@link vpx_codec_dec_cfg_t} view of the struct pointed to by the {@code dec} field. */
    @NativeType("vpx_codec_dec_cfg_t const *")
    public vpx_codec_dec_cfg_t dec() { return ndec(address()); }
    /** Returns a {@link vpx_codec_enc_cfg_t} view of the struct pointed to by the {@code enc} field. */
    @NativeType("vpx_codec_enc_cfg_t const *")
    public vpx_codec_enc_cfg_t enc() { return nenc(address()); }
    /**
     * Returns a {@link ByteBuffer} view of the data pointed to by the {@code raw} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("void const *")
    public ByteBuffer raw(int capacity) { return nraw(address(), capacity); }
    /** Returns the value of the {@code priv} field. */
    @NativeType("vpx_codec_priv_t *")
    public long priv() { return npriv(address()); }

    /** Sets the address of the specified {@link ByteBuffer} to the {@code name} field. */
    public vpx_codec_ctx_t name(@NativeType("char const *") ByteBuffer value) { nname(address(), value); return this; }
    /** Sets the specified value to the {@code iface} field. */
    public vpx_codec_ctx_t iface(@NativeType("vpx_codec_iface_t *") long value) { niface(address(), value); return this; }
    /** Sets the specified value to the {@code err} field. */
    public vpx_codec_ctx_t err(@NativeType("vpx_codec_err_t") int value) { nerr(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code err_detail} field. */
    public vpx_codec_ctx_t err_detail(@NativeType("char const *") ByteBuffer value) { nerr_detail(address(), value); return this; }
    /** Sets the specified value to the {@code init_flags} field. */
    public vpx_codec_ctx_t init_flags(long value) { ninit_flags(address(), value); return this; }
    /** Sets the address of the specified {@link vpx_codec_dec_cfg_t} to the {@code dec} field. */
    public vpx_codec_ctx_t dec(@NativeType("vpx_codec_dec_cfg_t const *") vpx_codec_dec_cfg_t value) { ndec(address(), value); return this; }
    /** Sets the address of the specified {@link vpx_codec_enc_cfg_t} to the {@code enc} field. */
    public vpx_codec_ctx_t enc(@NativeType("vpx_codec_enc_cfg_t const *") vpx_codec_enc_cfg_t value) { nenc(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code raw} field. */
    public vpx_codec_ctx_t raw(@NativeType("void const *") ByteBuffer value) { nraw(address(), value); return this; }
    /** Sets the specified value to the {@code priv} field. */
    public vpx_codec_ctx_t priv(@NativeType("vpx_codec_priv_t *") long value) { npriv(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public vpx_codec_ctx_t set(vpx_codec_ctx_t src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code vpx_codec_ctx_t} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static vpx_codec_ctx_t malloc() {
        return wrap(vpx_codec_ctx_t.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code vpx_codec_ctx_t} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static vpx_codec_ctx_t calloc() {
        return wrap(vpx_codec_ctx_t.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code vpx_codec_ctx_t} instance allocated with {@link BufferUtils}. */
    public static vpx_codec_ctx_t create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(vpx_codec_ctx_t.class, memAddress(container), container);
    }

    /** Returns a new {@code vpx_codec_ctx_t} instance for the specified memory address. */
    public static vpx_codec_ctx_t create(long address) {
        return wrap(vpx_codec_ctx_t.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static vpx_codec_ctx_t createSafe(long address) {
        return address == NULL ? null : wrap(vpx_codec_ctx_t.class, address);
    }

    /**
     * Returns a new {@link vpx_codec_ctx_t.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static vpx_codec_ctx_t.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link vpx_codec_ctx_t.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static vpx_codec_ctx_t.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link vpx_codec_ctx_t.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static vpx_codec_ctx_t.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link vpx_codec_ctx_t.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static vpx_codec_ctx_t.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static vpx_codec_ctx_t.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code vpx_codec_ctx_t} instance allocated on the thread-local {@link MemoryStack}. */
    public static vpx_codec_ctx_t mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code vpx_codec_ctx_t} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static vpx_codec_ctx_t callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code vpx_codec_ctx_t} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static vpx_codec_ctx_t mallocStack(MemoryStack stack) {
        return wrap(vpx_codec_ctx_t.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code vpx_codec_ctx_t} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static vpx_codec_ctx_t callocStack(MemoryStack stack) {
        return wrap(vpx_codec_ctx_t.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link vpx_codec_ctx_t.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static vpx_codec_ctx_t.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link vpx_codec_ctx_t.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static vpx_codec_ctx_t.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link vpx_codec_ctx_t.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static vpx_codec_ctx_t.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link vpx_codec_ctx_t.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static vpx_codec_ctx_t.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #name(int) name}. */
    public static ByteBuffer nname(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + vpx_codec_ctx_t.NAME), capacity); }
    /** Unsafe version of {@link #iface}. */
    public static long niface(long struct) { return memGetAddress(struct + vpx_codec_ctx_t.IFACE); }
    /** Unsafe version of {@link #err}. */
    public static int nerr(long struct) { return UNSAFE.getInt(null, struct + vpx_codec_ctx_t.ERR); }
    /** Unsafe version of {@link #err_detail(int) err_detail}. */
    public static ByteBuffer nerr_detail(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + vpx_codec_ctx_t.ERR_DETAIL), capacity); }
    /** Unsafe version of {@link #init_flags}. */
    public static long ninit_flags(long struct) { return memGetCLong(struct + vpx_codec_ctx_t.INIT_FLAGS); }
    /** Unsafe version of {@link #dec}. */
    public static vpx_codec_dec_cfg_t ndec(long struct) { return vpx_codec_dec_cfg_t.create(memGetAddress(struct + vpx_codec_ctx_t.DEC)); }
    /** Unsafe version of {@link #enc}. */
    public static vpx_codec_enc_cfg_t nenc(long struct) { return vpx_codec_enc_cfg_t.create(memGetAddress(struct + vpx_codec_ctx_t.ENC)); }
    /** Unsafe version of {@link #raw(int) raw}. */
    public static ByteBuffer nraw(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + vpx_codec_ctx_t.RAW), capacity); }
    /** Unsafe version of {@link #priv}. */
    public static long npriv(long struct) { return memGetAddress(struct + vpx_codec_ctx_t.PRIV); }

    /** Unsafe version of {@link #name(ByteBuffer) name}. */
    public static void nname(long struct, ByteBuffer value) { memPutAddress(struct + vpx_codec_ctx_t.NAME, memAddress(value)); }
    /** Unsafe version of {@link #iface(long) iface}. */
    public static void niface(long struct, long value) { memPutAddress(struct + vpx_codec_ctx_t.IFACE, check(value)); }
    /** Unsafe version of {@link #err(int) err}. */
    public static void nerr(long struct, int value) { UNSAFE.putInt(null, struct + vpx_codec_ctx_t.ERR, value); }
    /** Unsafe version of {@link #err_detail(ByteBuffer) err_detail}. */
    public static void nerr_detail(long struct, ByteBuffer value) { memPutAddress(struct + vpx_codec_ctx_t.ERR_DETAIL, memAddress(value)); }
    /** Unsafe version of {@link #init_flags(long) init_flags}. */
    public static void ninit_flags(long struct, long value) { memPutCLong(struct + vpx_codec_ctx_t.INIT_FLAGS, value); }
    /** Unsafe version of {@link #dec(vpx_codec_dec_cfg_t) dec}. */
    public static void ndec(long struct, vpx_codec_dec_cfg_t value) { memPutAddress(struct + vpx_codec_ctx_t.DEC, value.address()); }
    /** Unsafe version of {@link #enc(vpx_codec_enc_cfg_t) enc}. */
    public static void nenc(long struct, vpx_codec_enc_cfg_t value) { memPutAddress(struct + vpx_codec_ctx_t.ENC, value.address()); }
    /** Unsafe version of {@link #raw(ByteBuffer) raw}. */
    public static void nraw(long struct, ByteBuffer value) { memPutAddress(struct + vpx_codec_ctx_t.RAW, memAddress(value)); }
    /** Unsafe version of {@link #priv(long) priv}. */
    public static void npriv(long struct, long value) { memPutAddress(struct + vpx_codec_ctx_t.PRIV, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + vpx_codec_ctx_t.NAME));
        check(memGetAddress(struct + vpx_codec_ctx_t.IFACE));
        check(memGetAddress(struct + vpx_codec_ctx_t.ERR_DETAIL));
        check(memGetAddress(struct + vpx_codec_ctx_t.PRIV));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link vpx_codec_ctx_t} structs. */
    public static class Buffer extends StructBuffer<vpx_codec_ctx_t, Buffer> implements NativeResource {

        private static final vpx_codec_ctx_t ELEMENT_FACTORY = vpx_codec_ctx_t.create(-1L);

        /**
         * Creates a new {@code vpx_codec_ctx_t.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link vpx_codec_ctx_t#SIZEOF}, and its mark will be undefined.
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
        protected vpx_codec_ctx_t getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /**
         * Returns a {@link ByteBuffer} view of the data pointed to by the {@code name} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("char const *")
        public ByteBuffer name(int capacity) { return vpx_codec_ctx_t.nname(address(), capacity); }
        /** Returns the value of the {@code iface} field. */
        @NativeType("vpx_codec_iface_t *")
        public long iface() { return vpx_codec_ctx_t.niface(address()); }
        /** Returns the value of the {@code err} field. */
        @NativeType("vpx_codec_err_t")
        public int err() { return vpx_codec_ctx_t.nerr(address()); }
        /**
         * Returns a {@link ByteBuffer} view of the data pointed to by the {@code err_detail} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("char const *")
        public ByteBuffer err_detail(int capacity) { return vpx_codec_ctx_t.nerr_detail(address(), capacity); }
        /** Returns the value of the {@code init_flags} field. */
        public long init_flags() { return vpx_codec_ctx_t.ninit_flags(address()); }
        /** Returns a {@link vpx_codec_dec_cfg_t} view of the struct pointed to by the {@code dec} field. */
        @NativeType("vpx_codec_dec_cfg_t const *")
        public vpx_codec_dec_cfg_t dec() { return vpx_codec_ctx_t.ndec(address()); }
        /** Returns a {@link vpx_codec_enc_cfg_t} view of the struct pointed to by the {@code enc} field. */
        @NativeType("vpx_codec_enc_cfg_t const *")
        public vpx_codec_enc_cfg_t enc() { return vpx_codec_ctx_t.nenc(address()); }
        /**
         * Returns a {@link ByteBuffer} view of the data pointed to by the {@code raw} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("void const *")
        public ByteBuffer raw(int capacity) { return vpx_codec_ctx_t.nraw(address(), capacity); }
        /** Returns the value of the {@code priv} field. */
        @NativeType("vpx_codec_priv_t *")
        public long priv() { return vpx_codec_ctx_t.npriv(address()); }

        /** Sets the address of the specified {@link ByteBuffer} to the {@code name} field. */
        public vpx_codec_ctx_t.Buffer name(@NativeType("char const *") ByteBuffer value) { vpx_codec_ctx_t.nname(address(), value); return this; }
        /** Sets the specified value to the {@code iface} field. */
        public vpx_codec_ctx_t.Buffer iface(@NativeType("vpx_codec_iface_t *") long value) { vpx_codec_ctx_t.niface(address(), value); return this; }
        /** Sets the specified value to the {@code err} field. */
        public vpx_codec_ctx_t.Buffer err(@NativeType("vpx_codec_err_t") int value) { vpx_codec_ctx_t.nerr(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code err_detail} field. */
        public vpx_codec_ctx_t.Buffer err_detail(@NativeType("char const *") ByteBuffer value) { vpx_codec_ctx_t.nerr_detail(address(), value); return this; }
        /** Sets the specified value to the {@code init_flags} field. */
        public vpx_codec_ctx_t.Buffer init_flags(long value) { vpx_codec_ctx_t.ninit_flags(address(), value); return this; }
        /** Sets the address of the specified {@link vpx_codec_dec_cfg_t} to the {@code dec} field. */
        public vpx_codec_ctx_t.Buffer dec(@NativeType("vpx_codec_dec_cfg_t const *") vpx_codec_dec_cfg_t value) { vpx_codec_ctx_t.ndec(address(), value); return this; }
        /** Sets the address of the specified {@link vpx_codec_enc_cfg_t} to the {@code enc} field. */
        public vpx_codec_ctx_t.Buffer enc(@NativeType("vpx_codec_enc_cfg_t const *") vpx_codec_enc_cfg_t value) { vpx_codec_ctx_t.nenc(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code raw} field. */
        public vpx_codec_ctx_t.Buffer raw(@NativeType("void const *") ByteBuffer value) { vpx_codec_ctx_t.nraw(address(), value); return this; }
        /** Sets the specified value to the {@code priv} field. */
        public vpx_codec_ctx_t.Buffer priv(@NativeType("vpx_codec_priv_t *") long value) { vpx_codec_ctx_t.npriv(address(), value); return this; }

    }

}