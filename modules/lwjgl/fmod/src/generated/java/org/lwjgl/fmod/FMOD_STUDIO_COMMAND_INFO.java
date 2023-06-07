/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FMOD_STUDIO_COMMAND_INFO {
 *     char const * commandname;
 *     int parentcommandindex;
 *     int framenumber;
 *     float frametime;
 *     FMOD_STUDIO_INSTANCETYPE instancetype;
 *     FMOD_STUDIO_INSTANCETYPE outputtype;
 *     unsigned int instancehandle;
 *     unsigned int outputhandle;
 * }</code></pre>
 */
public class FMOD_STUDIO_COMMAND_INFO extends Struct<FMOD_STUDIO_COMMAND_INFO> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        COMMANDNAME,
        PARENTCOMMANDINDEX,
        FRAMENUMBER,
        FRAMETIME,
        INSTANCETYPE,
        OUTPUTTYPE,
        INSTANCEHANDLE,
        OUTPUTHANDLE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        COMMANDNAME = layout.offsetof(0);
        PARENTCOMMANDINDEX = layout.offsetof(1);
        FRAMENUMBER = layout.offsetof(2);
        FRAMETIME = layout.offsetof(3);
        INSTANCETYPE = layout.offsetof(4);
        OUTPUTTYPE = layout.offsetof(5);
        INSTANCEHANDLE = layout.offsetof(6);
        OUTPUTHANDLE = layout.offsetof(7);
    }

    protected FMOD_STUDIO_COMMAND_INFO(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_STUDIO_COMMAND_INFO create(long address, @Nullable ByteBuffer container) {
        return new FMOD_STUDIO_COMMAND_INFO(address, container);
    }

    /**
     * Creates a {@code FMOD_STUDIO_COMMAND_INFO} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_STUDIO_COMMAND_INFO(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code commandname} field. */
    @NativeType("char const *")
    public ByteBuffer commandname() { return ncommandname(address()); }
    /** @return the null-terminated string pointed to by the {@code commandname} field. */
    @NativeType("char const *")
    public String commandnameString() { return ncommandnameString(address()); }
    /** @return the value of the {@code parentcommandindex} field. */
    public int parentcommandindex() { return nparentcommandindex(address()); }
    /** @return the value of the {@code framenumber} field. */
    public int framenumber() { return nframenumber(address()); }
    /** @return the value of the {@code frametime} field. */
    public float frametime() { return nframetime(address()); }
    /** @return the value of the {@code instancetype} field. */
    @NativeType("FMOD_STUDIO_INSTANCETYPE")
    public int instancetype() { return ninstancetype(address()); }
    /** @return the value of the {@code outputtype} field. */
    @NativeType("FMOD_STUDIO_INSTANCETYPE")
    public int outputtype() { return noutputtype(address()); }
    /** @return the value of the {@code instancehandle} field. */
    @NativeType("unsigned int")
    public int instancehandle() { return ninstancehandle(address()); }
    /** @return the value of the {@code outputhandle} field. */
    @NativeType("unsigned int")
    public int outputhandle() { return noutputhandle(address()); }

    /** Sets the address of the specified encoded string to the {@code commandname} field. */
    public FMOD_STUDIO_COMMAND_INFO commandname(@NativeType("char const *") ByteBuffer value) { ncommandname(address(), value); return this; }
    /** Sets the specified value to the {@code parentcommandindex} field. */
    public FMOD_STUDIO_COMMAND_INFO parentcommandindex(int value) { nparentcommandindex(address(), value); return this; }
    /** Sets the specified value to the {@code framenumber} field. */
    public FMOD_STUDIO_COMMAND_INFO framenumber(int value) { nframenumber(address(), value); return this; }
    /** Sets the specified value to the {@code frametime} field. */
    public FMOD_STUDIO_COMMAND_INFO frametime(float value) { nframetime(address(), value); return this; }
    /** Sets the specified value to the {@code instancetype} field. */
    public FMOD_STUDIO_COMMAND_INFO instancetype(@NativeType("FMOD_STUDIO_INSTANCETYPE") int value) { ninstancetype(address(), value); return this; }
    /** Sets the specified value to the {@code outputtype} field. */
    public FMOD_STUDIO_COMMAND_INFO outputtype(@NativeType("FMOD_STUDIO_INSTANCETYPE") int value) { noutputtype(address(), value); return this; }
    /** Sets the specified value to the {@code instancehandle} field. */
    public FMOD_STUDIO_COMMAND_INFO instancehandle(@NativeType("unsigned int") int value) { ninstancehandle(address(), value); return this; }
    /** Sets the specified value to the {@code outputhandle} field. */
    public FMOD_STUDIO_COMMAND_INFO outputhandle(@NativeType("unsigned int") int value) { noutputhandle(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_STUDIO_COMMAND_INFO set(
        ByteBuffer commandname,
        int parentcommandindex,
        int framenumber,
        float frametime,
        int instancetype,
        int outputtype,
        int instancehandle,
        int outputhandle
    ) {
        commandname(commandname);
        parentcommandindex(parentcommandindex);
        framenumber(framenumber);
        frametime(frametime);
        instancetype(instancetype);
        outputtype(outputtype);
        instancehandle(instancehandle);
        outputhandle(outputhandle);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_STUDIO_COMMAND_INFO set(FMOD_STUDIO_COMMAND_INFO src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_STUDIO_COMMAND_INFO} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_STUDIO_COMMAND_INFO malloc() {
        return new FMOD_STUDIO_COMMAND_INFO(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_STUDIO_COMMAND_INFO} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_STUDIO_COMMAND_INFO calloc() {
        return new FMOD_STUDIO_COMMAND_INFO(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_STUDIO_COMMAND_INFO} instance allocated with {@link BufferUtils}. */
    public static FMOD_STUDIO_COMMAND_INFO create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_STUDIO_COMMAND_INFO(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_STUDIO_COMMAND_INFO} instance for the specified memory address. */
    public static FMOD_STUDIO_COMMAND_INFO create(long address) {
        return new FMOD_STUDIO_COMMAND_INFO(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_STUDIO_COMMAND_INFO createSafe(long address) {
        return address == NULL ? null : new FMOD_STUDIO_COMMAND_INFO(address, null);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_COMMAND_INFO.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_COMMAND_INFO.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_COMMAND_INFO.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_COMMAND_INFO.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_COMMAND_INFO.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_COMMAND_INFO.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_STUDIO_COMMAND_INFO.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_COMMAND_INFO.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_STUDIO_COMMAND_INFO.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_STUDIO_COMMAND_INFO} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_STUDIO_COMMAND_INFO malloc(MemoryStack stack) {
        return new FMOD_STUDIO_COMMAND_INFO(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_STUDIO_COMMAND_INFO} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_STUDIO_COMMAND_INFO calloc(MemoryStack stack) {
        return new FMOD_STUDIO_COMMAND_INFO(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_COMMAND_INFO.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_COMMAND_INFO.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_COMMAND_INFO.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_COMMAND_INFO.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #commandname}. */
    public static ByteBuffer ncommandname(long struct) { return memByteBufferNT1(memGetAddress(struct + FMOD_STUDIO_COMMAND_INFO.COMMANDNAME)); }
    /** Unsafe version of {@link #commandnameString}. */
    public static String ncommandnameString(long struct) { return memUTF8(memGetAddress(struct + FMOD_STUDIO_COMMAND_INFO.COMMANDNAME)); }
    /** Unsafe version of {@link #parentcommandindex}. */
    public static int nparentcommandindex(long struct) { return UNSAFE.getInt(null, struct + FMOD_STUDIO_COMMAND_INFO.PARENTCOMMANDINDEX); }
    /** Unsafe version of {@link #framenumber}. */
    public static int nframenumber(long struct) { return UNSAFE.getInt(null, struct + FMOD_STUDIO_COMMAND_INFO.FRAMENUMBER); }
    /** Unsafe version of {@link #frametime}. */
    public static float nframetime(long struct) { return UNSAFE.getFloat(null, struct + FMOD_STUDIO_COMMAND_INFO.FRAMETIME); }
    /** Unsafe version of {@link #instancetype}. */
    public static int ninstancetype(long struct) { return UNSAFE.getInt(null, struct + FMOD_STUDIO_COMMAND_INFO.INSTANCETYPE); }
    /** Unsafe version of {@link #outputtype}. */
    public static int noutputtype(long struct) { return UNSAFE.getInt(null, struct + FMOD_STUDIO_COMMAND_INFO.OUTPUTTYPE); }
    /** Unsafe version of {@link #instancehandle}. */
    public static int ninstancehandle(long struct) { return UNSAFE.getInt(null, struct + FMOD_STUDIO_COMMAND_INFO.INSTANCEHANDLE); }
    /** Unsafe version of {@link #outputhandle}. */
    public static int noutputhandle(long struct) { return UNSAFE.getInt(null, struct + FMOD_STUDIO_COMMAND_INFO.OUTPUTHANDLE); }

    /** Unsafe version of {@link #commandname(ByteBuffer) commandname}. */
    public static void ncommandname(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + FMOD_STUDIO_COMMAND_INFO.COMMANDNAME, memAddress(value));
    }
    /** Unsafe version of {@link #parentcommandindex(int) parentcommandindex}. */
    public static void nparentcommandindex(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_STUDIO_COMMAND_INFO.PARENTCOMMANDINDEX, value); }
    /** Unsafe version of {@link #framenumber(int) framenumber}. */
    public static void nframenumber(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_STUDIO_COMMAND_INFO.FRAMENUMBER, value); }
    /** Unsafe version of {@link #frametime(float) frametime}. */
    public static void nframetime(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_STUDIO_COMMAND_INFO.FRAMETIME, value); }
    /** Unsafe version of {@link #instancetype(int) instancetype}. */
    public static void ninstancetype(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_STUDIO_COMMAND_INFO.INSTANCETYPE, value); }
    /** Unsafe version of {@link #outputtype(int) outputtype}. */
    public static void noutputtype(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_STUDIO_COMMAND_INFO.OUTPUTTYPE, value); }
    /** Unsafe version of {@link #instancehandle(int) instancehandle}. */
    public static void ninstancehandle(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_STUDIO_COMMAND_INFO.INSTANCEHANDLE, value); }
    /** Unsafe version of {@link #outputhandle(int) outputhandle}. */
    public static void noutputhandle(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_STUDIO_COMMAND_INFO.OUTPUTHANDLE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + FMOD_STUDIO_COMMAND_INFO.COMMANDNAME));
    }

    // -----------------------------------

    /** An array of {@link FMOD_STUDIO_COMMAND_INFO} structs. */
    public static class Buffer extends StructBuffer<FMOD_STUDIO_COMMAND_INFO, Buffer> implements NativeResource {

        private static final FMOD_STUDIO_COMMAND_INFO ELEMENT_FACTORY = FMOD_STUDIO_COMMAND_INFO.create(-1L);

        /**
         * Creates a new {@code FMOD_STUDIO_COMMAND_INFO.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_STUDIO_COMMAND_INFO#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_STUDIO_COMMAND_INFO getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code commandname} field. */
        @NativeType("char const *")
        public ByteBuffer commandname() { return FMOD_STUDIO_COMMAND_INFO.ncommandname(address()); }
        /** @return the null-terminated string pointed to by the {@code commandname} field. */
        @NativeType("char const *")
        public String commandnameString() { return FMOD_STUDIO_COMMAND_INFO.ncommandnameString(address()); }
        /** @return the value of the {@code parentcommandindex} field. */
        public int parentcommandindex() { return FMOD_STUDIO_COMMAND_INFO.nparentcommandindex(address()); }
        /** @return the value of the {@code framenumber} field. */
        public int framenumber() { return FMOD_STUDIO_COMMAND_INFO.nframenumber(address()); }
        /** @return the value of the {@code frametime} field. */
        public float frametime() { return FMOD_STUDIO_COMMAND_INFO.nframetime(address()); }
        /** @return the value of the {@code instancetype} field. */
        @NativeType("FMOD_STUDIO_INSTANCETYPE")
        public int instancetype() { return FMOD_STUDIO_COMMAND_INFO.ninstancetype(address()); }
        /** @return the value of the {@code outputtype} field. */
        @NativeType("FMOD_STUDIO_INSTANCETYPE")
        public int outputtype() { return FMOD_STUDIO_COMMAND_INFO.noutputtype(address()); }
        /** @return the value of the {@code instancehandle} field. */
        @NativeType("unsigned int")
        public int instancehandle() { return FMOD_STUDIO_COMMAND_INFO.ninstancehandle(address()); }
        /** @return the value of the {@code outputhandle} field. */
        @NativeType("unsigned int")
        public int outputhandle() { return FMOD_STUDIO_COMMAND_INFO.noutputhandle(address()); }

        /** Sets the address of the specified encoded string to the {@code commandname} field. */
        public FMOD_STUDIO_COMMAND_INFO.Buffer commandname(@NativeType("char const *") ByteBuffer value) { FMOD_STUDIO_COMMAND_INFO.ncommandname(address(), value); return this; }
        /** Sets the specified value to the {@code parentcommandindex} field. */
        public FMOD_STUDIO_COMMAND_INFO.Buffer parentcommandindex(int value) { FMOD_STUDIO_COMMAND_INFO.nparentcommandindex(address(), value); return this; }
        /** Sets the specified value to the {@code framenumber} field. */
        public FMOD_STUDIO_COMMAND_INFO.Buffer framenumber(int value) { FMOD_STUDIO_COMMAND_INFO.nframenumber(address(), value); return this; }
        /** Sets the specified value to the {@code frametime} field. */
        public FMOD_STUDIO_COMMAND_INFO.Buffer frametime(float value) { FMOD_STUDIO_COMMAND_INFO.nframetime(address(), value); return this; }
        /** Sets the specified value to the {@code instancetype} field. */
        public FMOD_STUDIO_COMMAND_INFO.Buffer instancetype(@NativeType("FMOD_STUDIO_INSTANCETYPE") int value) { FMOD_STUDIO_COMMAND_INFO.ninstancetype(address(), value); return this; }
        /** Sets the specified value to the {@code outputtype} field. */
        public FMOD_STUDIO_COMMAND_INFO.Buffer outputtype(@NativeType("FMOD_STUDIO_INSTANCETYPE") int value) { FMOD_STUDIO_COMMAND_INFO.noutputtype(address(), value); return this; }
        /** Sets the specified value to the {@code instancehandle} field. */
        public FMOD_STUDIO_COMMAND_INFO.Buffer instancehandle(@NativeType("unsigned int") int value) { FMOD_STUDIO_COMMAND_INFO.ninstancehandle(address(), value); return this; }
        /** Sets the specified value to the {@code outputhandle} field. */
        public FMOD_STUDIO_COMMAND_INFO.Buffer outputhandle(@NativeType("unsigned int") int value) { FMOD_STUDIO_COMMAND_INFO.noutputhandle(address(), value); return this; }

    }

}