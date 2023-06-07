/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * The module class descriptor.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_Module_Class {
 *     FT_ULong module_flags;
 *     FT_Long module_size;
 *     FT_String const * module_name;
 *     FT_Fixed module_version;
 *     FT_Fixed module_requires;
 *     void const * module_interface;
 *     {@link FT_Module_ConstructorI FT_Module_Constructor} module_init;
 *     {@link FT_Module_DestructorI FT_Module_Destructor} module_done;
 *     {@link FT_Module_RequesterI FT_Module_Requester} get_interface;
 * }</code></pre>
 */
public class FT_Module_Class extends Struct<FT_Module_Class> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MODULE_FLAGS,
        MODULE_SIZE,
        MODULE_NAME,
        MODULE_VERSION,
        MODULE_REQUIRES,
        MODULE_INTERFACE,
        MODULE_INIT,
        MODULE_DONE,
        GET_INTERFACE;

    static {
        Layout layout = __struct(
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(POINTER_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MODULE_FLAGS = layout.offsetof(0);
        MODULE_SIZE = layout.offsetof(1);
        MODULE_NAME = layout.offsetof(2);
        MODULE_VERSION = layout.offsetof(3);
        MODULE_REQUIRES = layout.offsetof(4);
        MODULE_INTERFACE = layout.offsetof(5);
        MODULE_INIT = layout.offsetof(6);
        MODULE_DONE = layout.offsetof(7);
        GET_INTERFACE = layout.offsetof(8);
    }

    protected FT_Module_Class(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_Module_Class create(long address, @Nullable ByteBuffer container) {
        return new FT_Module_Class(address, container);
    }

    /**
     * Creates a {@code FT_Module_Class} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_Module_Class(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code module_flags} field. */
    @NativeType("FT_ULong")
    public long module_flags() { return nmodule_flags(address()); }
    /** @return the value of the {@code module_size} field. */
    @NativeType("FT_Long")
    public long module_size() { return nmodule_size(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code module_name} field. */
    @NativeType("FT_String const *")
    public ByteBuffer module_name() { return nmodule_name(address()); }
    /** @return the null-terminated string pointed to by the {@code module_name} field. */
    @NativeType("FT_String const *")
    public String module_nameString() { return nmodule_nameString(address()); }
    /** @return the value of the {@code module_version} field. */
    @NativeType("FT_Fixed")
    public long module_version() { return nmodule_version(address()); }
    /** @return the value of the {@code module_requires} field. */
    @NativeType("FT_Fixed")
    public long module_requires() { return nmodule_requires(address()); }
    /**
     * @return a {@link ByteBuffer} view of the data pointed to by the {@code module_interface} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @Nullable
    @NativeType("void const *")
    public ByteBuffer module_interface(int capacity) { return nmodule_interface(address(), capacity); }
    /** @return the value of the {@code module_init} field. */
    @Nullable
    public FT_Module_Constructor module_init() { return nmodule_init(address()); }
    /** @return the value of the {@code module_done} field. */
    @Nullable
    public FT_Module_Destructor module_done() { return nmodule_done(address()); }
    /** @return the value of the {@code get_interface} field. */
    @Nullable
    public FT_Module_Requester get_interface() { return nget_interface(address()); }

    /** Sets the specified value to the {@code module_flags} field. */
    public FT_Module_Class module_flags(@NativeType("FT_ULong") long value) { nmodule_flags(address(), value); return this; }
    /** Sets the specified value to the {@code module_size} field. */
    public FT_Module_Class module_size(@NativeType("FT_Long") long value) { nmodule_size(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code module_name} field. */
    public FT_Module_Class module_name(@NativeType("FT_String const *") ByteBuffer value) { nmodule_name(address(), value); return this; }
    /** Sets the specified value to the {@code module_version} field. */
    public FT_Module_Class module_version(@NativeType("FT_Fixed") long value) { nmodule_version(address(), value); return this; }
    /** Sets the specified value to the {@code module_requires} field. */
    public FT_Module_Class module_requires(@NativeType("FT_Fixed") long value) { nmodule_requires(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code module_interface} field. */
    public FT_Module_Class module_interface(@Nullable @NativeType("void const *") ByteBuffer value) { nmodule_interface(address(), value); return this; }
    /** Sets the specified value to the {@code module_init} field. */
    public FT_Module_Class module_init(@Nullable @NativeType("FT_Module_Constructor") FT_Module_ConstructorI value) { nmodule_init(address(), value); return this; }
    /** Sets the specified value to the {@code module_done} field. */
    public FT_Module_Class module_done(@Nullable @NativeType("FT_Module_Destructor") FT_Module_DestructorI value) { nmodule_done(address(), value); return this; }
    /** Sets the specified value to the {@code get_interface} field. */
    public FT_Module_Class get_interface(@Nullable @NativeType("FT_Module_Requester") FT_Module_RequesterI value) { nget_interface(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FT_Module_Class set(
        long module_flags,
        long module_size,
        ByteBuffer module_name,
        long module_version,
        long module_requires,
        @Nullable ByteBuffer module_interface,
        @Nullable FT_Module_ConstructorI module_init,
        @Nullable FT_Module_DestructorI module_done,
        @Nullable FT_Module_RequesterI get_interface
    ) {
        module_flags(module_flags);
        module_size(module_size);
        module_name(module_name);
        module_version(module_version);
        module_requires(module_requires);
        module_interface(module_interface);
        module_init(module_init);
        module_done(module_done);
        get_interface(get_interface);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FT_Module_Class set(FT_Module_Class src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FT_Module_Class} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FT_Module_Class malloc() {
        return new FT_Module_Class(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FT_Module_Class} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FT_Module_Class calloc() {
        return new FT_Module_Class(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FT_Module_Class} instance allocated with {@link BufferUtils}. */
    public static FT_Module_Class create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_Module_Class(memAddress(container), container);
    }

    /** Returns a new {@code FT_Module_Class} instance for the specified memory address. */
    public static FT_Module_Class create(long address) {
        return new FT_Module_Class(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Module_Class createSafe(long address) {
        return address == NULL ? null : new FT_Module_Class(address, null);
    }

    /**
     * Returns a new {@link FT_Module_Class.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Module_Class.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FT_Module_Class.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Module_Class.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_Module_Class.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Module_Class.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FT_Module_Class.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_Module_Class.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Module_Class.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FT_Module_Class} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_Module_Class malloc(MemoryStack stack) {
        return new FT_Module_Class(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FT_Module_Class} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_Module_Class calloc(MemoryStack stack) {
        return new FT_Module_Class(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FT_Module_Class.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_Module_Class.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_Module_Class.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_Module_Class.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #module_flags}. */
    public static long nmodule_flags(long struct) { return memGetCLong(struct + FT_Module_Class.MODULE_FLAGS); }
    /** Unsafe version of {@link #module_size}. */
    public static long nmodule_size(long struct) { return memGetCLong(struct + FT_Module_Class.MODULE_SIZE); }
    /** Unsafe version of {@link #module_name}. */
    public static ByteBuffer nmodule_name(long struct) { return memByteBufferNT1(memGetAddress(struct + FT_Module_Class.MODULE_NAME)); }
    /** Unsafe version of {@link #module_nameString}. */
    public static String nmodule_nameString(long struct) { return memUTF8(memGetAddress(struct + FT_Module_Class.MODULE_NAME)); }
    /** Unsafe version of {@link #module_version}. */
    public static long nmodule_version(long struct) { return memGetCLong(struct + FT_Module_Class.MODULE_VERSION); }
    /** Unsafe version of {@link #module_requires}. */
    public static long nmodule_requires(long struct) { return memGetCLong(struct + FT_Module_Class.MODULE_REQUIRES); }
    /** Unsafe version of {@link #module_interface(int) module_interface}. */
    @Nullable public static ByteBuffer nmodule_interface(long struct, int capacity) { return memByteBufferSafe(memGetAddress(struct + FT_Module_Class.MODULE_INTERFACE), capacity); }
    /** Unsafe version of {@link #module_init}. */
    @Nullable public static FT_Module_Constructor nmodule_init(long struct) { return FT_Module_Constructor.createSafe(memGetAddress(struct + FT_Module_Class.MODULE_INIT)); }
    /** Unsafe version of {@link #module_done}. */
    @Nullable public static FT_Module_Destructor nmodule_done(long struct) { return FT_Module_Destructor.createSafe(memGetAddress(struct + FT_Module_Class.MODULE_DONE)); }
    /** Unsafe version of {@link #get_interface}. */
    @Nullable public static FT_Module_Requester nget_interface(long struct) { return FT_Module_Requester.createSafe(memGetAddress(struct + FT_Module_Class.GET_INTERFACE)); }

    /** Unsafe version of {@link #module_flags(long) module_flags}. */
    public static void nmodule_flags(long struct, long value) { memPutCLong(struct + FT_Module_Class.MODULE_FLAGS, value); }
    /** Unsafe version of {@link #module_size(long) module_size}. */
    public static void nmodule_size(long struct, long value) { memPutCLong(struct + FT_Module_Class.MODULE_SIZE, value); }
    /** Unsafe version of {@link #module_name(ByteBuffer) module_name}. */
    public static void nmodule_name(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + FT_Module_Class.MODULE_NAME, memAddress(value));
    }
    /** Unsafe version of {@link #module_version(long) module_version}. */
    public static void nmodule_version(long struct, long value) { memPutCLong(struct + FT_Module_Class.MODULE_VERSION, value); }
    /** Unsafe version of {@link #module_requires(long) module_requires}. */
    public static void nmodule_requires(long struct, long value) { memPutCLong(struct + FT_Module_Class.MODULE_REQUIRES, value); }
    /** Unsafe version of {@link #module_interface(ByteBuffer) module_interface}. */
    public static void nmodule_interface(long struct, @Nullable ByteBuffer value) { memPutAddress(struct + FT_Module_Class.MODULE_INTERFACE, memAddressSafe(value)); }
    /** Unsafe version of {@link #module_init(FT_Module_ConstructorI) module_init}. */
    public static void nmodule_init(long struct, @Nullable FT_Module_ConstructorI value) { memPutAddress(struct + FT_Module_Class.MODULE_INIT, memAddressSafe(value)); }
    /** Unsafe version of {@link #module_done(FT_Module_DestructorI) module_done}. */
    public static void nmodule_done(long struct, @Nullable FT_Module_DestructorI value) { memPutAddress(struct + FT_Module_Class.MODULE_DONE, memAddressSafe(value)); }
    /** Unsafe version of {@link #get_interface(FT_Module_RequesterI) get_interface}. */
    public static void nget_interface(long struct, @Nullable FT_Module_RequesterI value) { memPutAddress(struct + FT_Module_Class.GET_INTERFACE, memAddressSafe(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + FT_Module_Class.MODULE_NAME));
    }

    // -----------------------------------

    /** An array of {@link FT_Module_Class} structs. */
    public static class Buffer extends StructBuffer<FT_Module_Class, Buffer> implements NativeResource {

        private static final FT_Module_Class ELEMENT_FACTORY = FT_Module_Class.create(-1L);

        /**
         * Creates a new {@code FT_Module_Class.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_Module_Class#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_Module_Class getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code module_flags} field. */
        @NativeType("FT_ULong")
        public long module_flags() { return FT_Module_Class.nmodule_flags(address()); }
        /** @return the value of the {@code module_size} field. */
        @NativeType("FT_Long")
        public long module_size() { return FT_Module_Class.nmodule_size(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code module_name} field. */
        @NativeType("FT_String const *")
        public ByteBuffer module_name() { return FT_Module_Class.nmodule_name(address()); }
        /** @return the null-terminated string pointed to by the {@code module_name} field. */
        @NativeType("FT_String const *")
        public String module_nameString() { return FT_Module_Class.nmodule_nameString(address()); }
        /** @return the value of the {@code module_version} field. */
        @NativeType("FT_Fixed")
        public long module_version() { return FT_Module_Class.nmodule_version(address()); }
        /** @return the value of the {@code module_requires} field. */
        @NativeType("FT_Fixed")
        public long module_requires() { return FT_Module_Class.nmodule_requires(address()); }
        /**
         * @return a {@link ByteBuffer} view of the data pointed to by the {@code module_interface} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @Nullable
        @NativeType("void const *")
        public ByteBuffer module_interface(int capacity) { return FT_Module_Class.nmodule_interface(address(), capacity); }
        /** @return the value of the {@code module_init} field. */
        @Nullable
        public FT_Module_Constructor module_init() { return FT_Module_Class.nmodule_init(address()); }
        /** @return the value of the {@code module_done} field. */
        @Nullable
        public FT_Module_Destructor module_done() { return FT_Module_Class.nmodule_done(address()); }
        /** @return the value of the {@code get_interface} field. */
        @Nullable
        public FT_Module_Requester get_interface() { return FT_Module_Class.nget_interface(address()); }

        /** Sets the specified value to the {@code module_flags} field. */
        public FT_Module_Class.Buffer module_flags(@NativeType("FT_ULong") long value) { FT_Module_Class.nmodule_flags(address(), value); return this; }
        /** Sets the specified value to the {@code module_size} field. */
        public FT_Module_Class.Buffer module_size(@NativeType("FT_Long") long value) { FT_Module_Class.nmodule_size(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code module_name} field. */
        public FT_Module_Class.Buffer module_name(@NativeType("FT_String const *") ByteBuffer value) { FT_Module_Class.nmodule_name(address(), value); return this; }
        /** Sets the specified value to the {@code module_version} field. */
        public FT_Module_Class.Buffer module_version(@NativeType("FT_Fixed") long value) { FT_Module_Class.nmodule_version(address(), value); return this; }
        /** Sets the specified value to the {@code module_requires} field. */
        public FT_Module_Class.Buffer module_requires(@NativeType("FT_Fixed") long value) { FT_Module_Class.nmodule_requires(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code module_interface} field. */
        public FT_Module_Class.Buffer module_interface(@Nullable @NativeType("void const *") ByteBuffer value) { FT_Module_Class.nmodule_interface(address(), value); return this; }
        /** Sets the specified value to the {@code module_init} field. */
        public FT_Module_Class.Buffer module_init(@Nullable @NativeType("FT_Module_Constructor") FT_Module_ConstructorI value) { FT_Module_Class.nmodule_init(address(), value); return this; }
        /** Sets the specified value to the {@code module_done} field. */
        public FT_Module_Class.Buffer module_done(@Nullable @NativeType("FT_Module_Destructor") FT_Module_DestructorI value) { FT_Module_Class.nmodule_done(address(), value); return this; }
        /** Sets the specified value to the {@code get_interface} field. */
        public FT_Module_Class.Buffer get_interface(@Nullable @NativeType("FT_Module_Requester") FT_Module_RequesterI value) { FT_Module_Class.nget_interface(address(), value); return this; }

    }

}