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
 * struct FMOD_DSP_DESCRIPTION {
 *     unsigned int pluginsdkversion;
 *     char name[32];
 *     unsigned int version;
 *     int numinputbuffers;
 *     int numoutputbuffers;
 *     {@link FMOD_DSP_CREATE_CALLBACKI FMOD_DSP_CREATE_CALLBACK} create;
 *     {@link FMOD_DSP_RELEASE_CALLBACKI FMOD_DSP_RELEASE_CALLBACK} release;
 *     {@link FMOD_DSP_RESET_CALLBACKI FMOD_DSP_RESET_CALLBACK} reset;
 *     {@link FMOD_DSP_READ_CALLBACKI FMOD_DSP_READ_CALLBACK} read;
 *     {@link FMOD_DSP_PROCESS_CALLBACKI FMOD_DSP_PROCESS_CALLBACK} process;
 *     {@link FMOD_DSP_SETPOSITION_CALLBACKI FMOD_DSP_SETPOSITION_CALLBACK} setposition;
 *     int numparameters;
 *     {@link FMOD_DSP_PARAMETER_DESC FMOD_DSP_PARAMETER_DESC} ** paramdesc;
 *     {@link FMOD_DSP_SETPARAM_FLOAT_CALLBACKI FMOD_DSP_SETPARAM_FLOAT_CALLBACK} setparameterfloat;
 *     {@link FMOD_DSP_SETPARAM_INT_CALLBACKI FMOD_DSP_SETPARAM_INT_CALLBACK} setparameterint;
 *     {@link FMOD_DSP_SETPARAM_BOOL_CALLBACKI FMOD_DSP_SETPARAM_BOOL_CALLBACK} setparameterbool;
 *     {@link FMOD_DSP_SETPARAM_DATA_CALLBACKI FMOD_DSP_SETPARAM_DATA_CALLBACK} setparameterdata;
 *     {@link FMOD_DSP_GETPARAM_FLOAT_CALLBACKI FMOD_DSP_GETPARAM_FLOAT_CALLBACK} getparameterfloat;
 *     {@link FMOD_DSP_GETPARAM_INT_CALLBACKI FMOD_DSP_GETPARAM_INT_CALLBACK} getparameterint;
 *     {@link FMOD_DSP_GETPARAM_BOOL_CALLBACKI FMOD_DSP_GETPARAM_BOOL_CALLBACK} getparameterbool;
 *     {@link FMOD_DSP_GETPARAM_DATA_CALLBACKI FMOD_DSP_GETPARAM_DATA_CALLBACK} getparameterdata;
 *     {@link FMOD_DSP_SHOULDIPROCESS_CALLBACKI FMOD_DSP_SHOULDIPROCESS_CALLBACK} shouldiprocess;
 *     void * userdata;
 *     {@link FMOD_DSP_SYSTEM_REGISTER_CALLBACKI FMOD_DSP_SYSTEM_REGISTER_CALLBACK} sys_register;
 *     {@link FMOD_DSP_SYSTEM_DEREGISTER_CALLBACKI FMOD_DSP_SYSTEM_DEREGISTER_CALLBACK} sys_deregister;
 *     {@link FMOD_DSP_SYSTEM_MIX_CALLBACKI FMOD_DSP_SYSTEM_MIX_CALLBACK} sys_mix;
 * }</code></pre>
 */
public class FMOD_DSP_DESCRIPTION extends Struct<FMOD_DSP_DESCRIPTION> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PLUGINSDKVERSION,
        NAME,
        VERSION,
        NUMINPUTBUFFERS,
        NUMOUTPUTBUFFERS,
        CREATE,
        RELEASE,
        RESET,
        READ,
        PROCESS,
        SETPOSITION,
        NUMPARAMETERS,
        PARAMDESC,
        SETPARAMETERFLOAT,
        SETPARAMETERINT,
        SETPARAMETERBOOL,
        SETPARAMETERDATA,
        GETPARAMETERFLOAT,
        GETPARAMETERINT,
        GETPARAMETERBOOL,
        GETPARAMETERDATA,
        SHOULDIPROCESS,
        USERDATA,
        SYS_REGISTER,
        SYS_DEREGISTER,
        SYS_MIX;

    static {
        Layout layout = __struct(
            __member(4),
            __array(1, 32),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PLUGINSDKVERSION = layout.offsetof(0);
        NAME = layout.offsetof(1);
        VERSION = layout.offsetof(2);
        NUMINPUTBUFFERS = layout.offsetof(3);
        NUMOUTPUTBUFFERS = layout.offsetof(4);
        CREATE = layout.offsetof(5);
        RELEASE = layout.offsetof(6);
        RESET = layout.offsetof(7);
        READ = layout.offsetof(8);
        PROCESS = layout.offsetof(9);
        SETPOSITION = layout.offsetof(10);
        NUMPARAMETERS = layout.offsetof(11);
        PARAMDESC = layout.offsetof(12);
        SETPARAMETERFLOAT = layout.offsetof(13);
        SETPARAMETERINT = layout.offsetof(14);
        SETPARAMETERBOOL = layout.offsetof(15);
        SETPARAMETERDATA = layout.offsetof(16);
        GETPARAMETERFLOAT = layout.offsetof(17);
        GETPARAMETERINT = layout.offsetof(18);
        GETPARAMETERBOOL = layout.offsetof(19);
        GETPARAMETERDATA = layout.offsetof(20);
        SHOULDIPROCESS = layout.offsetof(21);
        USERDATA = layout.offsetof(22);
        SYS_REGISTER = layout.offsetof(23);
        SYS_DEREGISTER = layout.offsetof(24);
        SYS_MIX = layout.offsetof(25);
    }

    protected FMOD_DSP_DESCRIPTION(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_DSP_DESCRIPTION create(long address, @Nullable ByteBuffer container) {
        return new FMOD_DSP_DESCRIPTION(address, container);
    }

    /**
     * Creates a {@code FMOD_DSP_DESCRIPTION} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_DSP_DESCRIPTION(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code pluginsdkversion} field. */
    @NativeType("unsigned int")
    public int pluginsdkversion() { return npluginsdkversion(address()); }
    /** @return a {@link ByteBuffer} view of the {@code name} field. */
    @NativeType("char[32]")
    public ByteBuffer name() { return nname(address()); }
    /** @return the value at the specified index of the {@code name} field. */
    @NativeType("char")
    public byte name(int index) { return nname(address(), index); }
    /** @return the value of the {@code version} field. */
    @NativeType("unsigned int")
    public int version() { return nversion(address()); }
    /** @return the value of the {@code numinputbuffers} field. */
    public int numinputbuffers() { return nnuminputbuffers(address()); }
    /** @return the value of the {@code numoutputbuffers} field. */
    public int numoutputbuffers() { return nnumoutputbuffers(address()); }
    /** @return the value of the {@code create} field. */
    @Nullable
    public FMOD_DSP_CREATE_CALLBACK create$() { return ncreate$(address()); }
    /** @return the value of the {@code release} field. */
    @Nullable
    public FMOD_DSP_RELEASE_CALLBACK release() { return nrelease(address()); }
    /** @return the value of the {@code reset} field. */
    public FMOD_DSP_RESET_CALLBACK reset$() { return nreset$(address()); }
    /** @return the value of the {@code read} field. */
    @Nullable
    public FMOD_DSP_READ_CALLBACK read() { return nread(address()); }
    /** @return the value of the {@code process} field. */
    @Nullable
    public FMOD_DSP_PROCESS_CALLBACK process() { return nprocess(address()); }
    /** @return the value of the {@code setposition} field. */
    @Nullable
    public FMOD_DSP_SETPOSITION_CALLBACK setposition() { return nsetposition(address()); }
    /** @return the value of the {@code numparameters} field. */
    public int numparameters() { return nnumparameters(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code paramdesc} field. */
    @NativeType("FMOD_DSP_PARAMETER_DESC **")
    public PointerBuffer paramdesc() { return nparamdesc(address()); }
    /** @return the value of the {@code setparameterfloat} field. */
    @Nullable
    public FMOD_DSP_SETPARAM_FLOAT_CALLBACK setparameterfloat() { return nsetparameterfloat(address()); }
    /** @return the value of the {@code setparameterint} field. */
    @Nullable
    public FMOD_DSP_SETPARAM_INT_CALLBACK setparameterint() { return nsetparameterint(address()); }
    /** @return the value of the {@code setparameterbool} field. */
    @Nullable
    public FMOD_DSP_SETPARAM_BOOL_CALLBACK setparameterbool() { return nsetparameterbool(address()); }
    /** @return the value of the {@code setparameterdata} field. */
    @Nullable
    public FMOD_DSP_SETPARAM_DATA_CALLBACK setparameterdata() { return nsetparameterdata(address()); }
    /** @return the value of the {@code getparameterfloat} field. */
    @Nullable
    public FMOD_DSP_GETPARAM_FLOAT_CALLBACK getparameterfloat() { return ngetparameterfloat(address()); }
    /** @return the value of the {@code getparameterint} field. */
    @Nullable
    public FMOD_DSP_GETPARAM_INT_CALLBACK getparameterint() { return ngetparameterint(address()); }
    /** @return the value of the {@code getparameterbool} field. */
    @Nullable
    public FMOD_DSP_GETPARAM_BOOL_CALLBACK getparameterbool() { return ngetparameterbool(address()); }
    /** @return the value of the {@code getparameterdata} field. */
    @Nullable
    public FMOD_DSP_GETPARAM_DATA_CALLBACK getparameterdata() { return ngetparameterdata(address()); }
    /** @return the value of the {@code shouldiprocess} field. */
    public FMOD_DSP_SHOULDIPROCESS_CALLBACK shouldiprocess() { return nshouldiprocess(address()); }
    /** @return the value of the {@code userdata} field. */
    @NativeType("void *")
    public long userdata() { return nuserdata(address()); }
    /** @return the value of the {@code sys_register} field. */
    @Nullable
    public FMOD_DSP_SYSTEM_REGISTER_CALLBACK sys_register() { return nsys_register(address()); }
    /** @return the value of the {@code sys_deregister} field. */
    @Nullable
    public FMOD_DSP_SYSTEM_DEREGISTER_CALLBACK sys_deregister() { return nsys_deregister(address()); }
    /** @return the value of the {@code sys_mix} field. */
    @Nullable
    public FMOD_DSP_SYSTEM_MIX_CALLBACK sys_mix() { return nsys_mix(address()); }

    /** Sets the specified value to the {@code pluginsdkversion} field. */
    public FMOD_DSP_DESCRIPTION pluginsdkversion(@NativeType("unsigned int") int value) { npluginsdkversion(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code name} field. */
    public FMOD_DSP_DESCRIPTION name(@NativeType("char[32]") ByteBuffer value) { nname(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code name} field. */
    public FMOD_DSP_DESCRIPTION name(int index, @NativeType("char") byte value) { nname(address(), index, value); return this; }
    /** Sets the specified value to the {@code version} field. */
    public FMOD_DSP_DESCRIPTION version(@NativeType("unsigned int") int value) { nversion(address(), value); return this; }
    /** Sets the specified value to the {@code numinputbuffers} field. */
    public FMOD_DSP_DESCRIPTION numinputbuffers(int value) { nnuminputbuffers(address(), value); return this; }
    /** Sets the specified value to the {@code numoutputbuffers} field. */
    public FMOD_DSP_DESCRIPTION numoutputbuffers(int value) { nnumoutputbuffers(address(), value); return this; }
    /** Sets the specified value to the {@code create} field. */
    public FMOD_DSP_DESCRIPTION create$(@Nullable @NativeType("FMOD_DSP_CREATE_CALLBACK") FMOD_DSP_CREATE_CALLBACKI value) { ncreate$(address(), value); return this; }
    /** Sets the specified value to the {@code release} field. */
    public FMOD_DSP_DESCRIPTION release(@Nullable @NativeType("FMOD_DSP_RELEASE_CALLBACK") FMOD_DSP_RELEASE_CALLBACKI value) { nrelease(address(), value); return this; }
    /** Sets the specified value to the {@code reset} field. */
    public FMOD_DSP_DESCRIPTION reset$(@NativeType("FMOD_DSP_RESET_CALLBACK") FMOD_DSP_RESET_CALLBACKI value) { nreset$(address(), value); return this; }
    /** Sets the specified value to the {@code read} field. */
    public FMOD_DSP_DESCRIPTION read(@Nullable @NativeType("FMOD_DSP_READ_CALLBACK") FMOD_DSP_READ_CALLBACKI value) { nread(address(), value); return this; }
    /** Sets the specified value to the {@code process} field. */
    public FMOD_DSP_DESCRIPTION process(@Nullable @NativeType("FMOD_DSP_PROCESS_CALLBACK") FMOD_DSP_PROCESS_CALLBACKI value) { nprocess(address(), value); return this; }
    /** Sets the specified value to the {@code setposition} field. */
    public FMOD_DSP_DESCRIPTION setposition(@Nullable @NativeType("FMOD_DSP_SETPOSITION_CALLBACK") FMOD_DSP_SETPOSITION_CALLBACKI value) { nsetposition(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code paramdesc} field. */
    public FMOD_DSP_DESCRIPTION paramdesc(@NativeType("FMOD_DSP_PARAMETER_DESC **") PointerBuffer value) { nparamdesc(address(), value); return this; }
    /** Sets the specified value to the {@code setparameterfloat} field. */
    public FMOD_DSP_DESCRIPTION setparameterfloat(@Nullable @NativeType("FMOD_DSP_SETPARAM_FLOAT_CALLBACK") FMOD_DSP_SETPARAM_FLOAT_CALLBACKI value) { nsetparameterfloat(address(), value); return this; }
    /** Sets the specified value to the {@code setparameterint} field. */
    public FMOD_DSP_DESCRIPTION setparameterint(@Nullable @NativeType("FMOD_DSP_SETPARAM_INT_CALLBACK") FMOD_DSP_SETPARAM_INT_CALLBACKI value) { nsetparameterint(address(), value); return this; }
    /** Sets the specified value to the {@code setparameterbool} field. */
    public FMOD_DSP_DESCRIPTION setparameterbool(@Nullable @NativeType("FMOD_DSP_SETPARAM_BOOL_CALLBACK") FMOD_DSP_SETPARAM_BOOL_CALLBACKI value) { nsetparameterbool(address(), value); return this; }
    /** Sets the specified value to the {@code setparameterdata} field. */
    public FMOD_DSP_DESCRIPTION setparameterdata(@Nullable @NativeType("FMOD_DSP_SETPARAM_DATA_CALLBACK") FMOD_DSP_SETPARAM_DATA_CALLBACKI value) { nsetparameterdata(address(), value); return this; }
    /** Sets the specified value to the {@code getparameterfloat} field. */
    public FMOD_DSP_DESCRIPTION getparameterfloat(@Nullable @NativeType("FMOD_DSP_GETPARAM_FLOAT_CALLBACK") FMOD_DSP_GETPARAM_FLOAT_CALLBACKI value) { ngetparameterfloat(address(), value); return this; }
    /** Sets the specified value to the {@code getparameterint} field. */
    public FMOD_DSP_DESCRIPTION getparameterint(@Nullable @NativeType("FMOD_DSP_GETPARAM_INT_CALLBACK") FMOD_DSP_GETPARAM_INT_CALLBACKI value) { ngetparameterint(address(), value); return this; }
    /** Sets the specified value to the {@code getparameterbool} field. */
    public FMOD_DSP_DESCRIPTION getparameterbool(@Nullable @NativeType("FMOD_DSP_GETPARAM_BOOL_CALLBACK") FMOD_DSP_GETPARAM_BOOL_CALLBACKI value) { ngetparameterbool(address(), value); return this; }
    /** Sets the specified value to the {@code getparameterdata} field. */
    public FMOD_DSP_DESCRIPTION getparameterdata(@Nullable @NativeType("FMOD_DSP_GETPARAM_DATA_CALLBACK") FMOD_DSP_GETPARAM_DATA_CALLBACKI value) { ngetparameterdata(address(), value); return this; }
    /** Sets the specified value to the {@code shouldiprocess} field. */
    public FMOD_DSP_DESCRIPTION shouldiprocess(@NativeType("FMOD_DSP_SHOULDIPROCESS_CALLBACK") FMOD_DSP_SHOULDIPROCESS_CALLBACKI value) { nshouldiprocess(address(), value); return this; }
    /** Sets the specified value to the {@code userdata} field. */
    public FMOD_DSP_DESCRIPTION userdata(@NativeType("void *") long value) { nuserdata(address(), value); return this; }
    /** Sets the specified value to the {@code sys_register} field. */
    public FMOD_DSP_DESCRIPTION sys_register(@Nullable @NativeType("FMOD_DSP_SYSTEM_REGISTER_CALLBACK") FMOD_DSP_SYSTEM_REGISTER_CALLBACKI value) { nsys_register(address(), value); return this; }
    /** Sets the specified value to the {@code sys_deregister} field. */
    public FMOD_DSP_DESCRIPTION sys_deregister(@Nullable @NativeType("FMOD_DSP_SYSTEM_DEREGISTER_CALLBACK") FMOD_DSP_SYSTEM_DEREGISTER_CALLBACKI value) { nsys_deregister(address(), value); return this; }
    /** Sets the specified value to the {@code sys_mix} field. */
    public FMOD_DSP_DESCRIPTION sys_mix(@Nullable @NativeType("FMOD_DSP_SYSTEM_MIX_CALLBACK") FMOD_DSP_SYSTEM_MIX_CALLBACKI value) { nsys_mix(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_DSP_DESCRIPTION set(
        int pluginsdkversion,
        ByteBuffer name,
        int version,
        int numinputbuffers,
        int numoutputbuffers,
        @Nullable FMOD_DSP_CREATE_CALLBACKI create$,
        @Nullable FMOD_DSP_RELEASE_CALLBACKI release,
        FMOD_DSP_RESET_CALLBACKI reset$,
        @Nullable FMOD_DSP_READ_CALLBACKI read,
        @Nullable FMOD_DSP_PROCESS_CALLBACKI process,
        @Nullable FMOD_DSP_SETPOSITION_CALLBACKI setposition,
        PointerBuffer paramdesc,
        @Nullable FMOD_DSP_SETPARAM_FLOAT_CALLBACKI setparameterfloat,
        @Nullable FMOD_DSP_SETPARAM_INT_CALLBACKI setparameterint,
        @Nullable FMOD_DSP_SETPARAM_BOOL_CALLBACKI setparameterbool,
        @Nullable FMOD_DSP_SETPARAM_DATA_CALLBACKI setparameterdata,
        @Nullable FMOD_DSP_GETPARAM_FLOAT_CALLBACKI getparameterfloat,
        @Nullable FMOD_DSP_GETPARAM_INT_CALLBACKI getparameterint,
        @Nullable FMOD_DSP_GETPARAM_BOOL_CALLBACKI getparameterbool,
        @Nullable FMOD_DSP_GETPARAM_DATA_CALLBACKI getparameterdata,
        FMOD_DSP_SHOULDIPROCESS_CALLBACKI shouldiprocess,
        long userdata,
        @Nullable FMOD_DSP_SYSTEM_REGISTER_CALLBACKI sys_register,
        @Nullable FMOD_DSP_SYSTEM_DEREGISTER_CALLBACKI sys_deregister,
        @Nullable FMOD_DSP_SYSTEM_MIX_CALLBACKI sys_mix
    ) {
        pluginsdkversion(pluginsdkversion);
        name(name);
        version(version);
        numinputbuffers(numinputbuffers);
        numoutputbuffers(numoutputbuffers);
        create$(create$);
        release(release);
        reset$(reset$);
        read(read);
        process(process);
        setposition(setposition);
        paramdesc(paramdesc);
        setparameterfloat(setparameterfloat);
        setparameterint(setparameterint);
        setparameterbool(setparameterbool);
        setparameterdata(setparameterdata);
        getparameterfloat(getparameterfloat);
        getparameterint(getparameterint);
        getparameterbool(getparameterbool);
        getparameterdata(getparameterdata);
        shouldiprocess(shouldiprocess);
        userdata(userdata);
        sys_register(sys_register);
        sys_deregister(sys_deregister);
        sys_mix(sys_mix);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_DSP_DESCRIPTION set(FMOD_DSP_DESCRIPTION src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_DSP_DESCRIPTION} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_DSP_DESCRIPTION malloc() {
        return new FMOD_DSP_DESCRIPTION(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_DSP_DESCRIPTION} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_DSP_DESCRIPTION calloc() {
        return new FMOD_DSP_DESCRIPTION(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_DSP_DESCRIPTION} instance allocated with {@link BufferUtils}. */
    public static FMOD_DSP_DESCRIPTION create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_DSP_DESCRIPTION(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_DSP_DESCRIPTION} instance for the specified memory address. */
    public static FMOD_DSP_DESCRIPTION create(long address) {
        return new FMOD_DSP_DESCRIPTION(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_DSP_DESCRIPTION createSafe(long address) {
        return address == NULL ? null : new FMOD_DSP_DESCRIPTION(address, null);
    }

    /**
     * Returns a new {@link FMOD_DSP_DESCRIPTION.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_DESCRIPTION.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_DESCRIPTION.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_DESCRIPTION.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_DESCRIPTION.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_DESCRIPTION.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_DSP_DESCRIPTION.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_DESCRIPTION.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_DSP_DESCRIPTION.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_DSP_DESCRIPTION} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_DSP_DESCRIPTION malloc(MemoryStack stack) {
        return new FMOD_DSP_DESCRIPTION(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_DSP_DESCRIPTION} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_DSP_DESCRIPTION calloc(MemoryStack stack) {
        return new FMOD_DSP_DESCRIPTION(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_DSP_DESCRIPTION.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_DESCRIPTION.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_DESCRIPTION.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_DESCRIPTION.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #pluginsdkversion}. */
    public static int npluginsdkversion(long struct) { return UNSAFE.getInt(null, struct + FMOD_DSP_DESCRIPTION.PLUGINSDKVERSION); }
    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBuffer(struct + FMOD_DSP_DESCRIPTION.NAME, 32); }
    /** Unsafe version of {@link #name(int) name}. */
    public static byte nname(long struct, int index) {
        return UNSAFE.getByte(null, struct + FMOD_DSP_DESCRIPTION.NAME + check(index, 32) * 1);
    }
    /** Unsafe version of {@link #version}. */
    public static int nversion(long struct) { return UNSAFE.getInt(null, struct + FMOD_DSP_DESCRIPTION.VERSION); }
    /** Unsafe version of {@link #numinputbuffers}. */
    public static int nnuminputbuffers(long struct) { return UNSAFE.getInt(null, struct + FMOD_DSP_DESCRIPTION.NUMINPUTBUFFERS); }
    /** Unsafe version of {@link #numoutputbuffers}. */
    public static int nnumoutputbuffers(long struct) { return UNSAFE.getInt(null, struct + FMOD_DSP_DESCRIPTION.NUMOUTPUTBUFFERS); }
    /** Unsafe version of {@link #create$}. */
    @Nullable public static FMOD_DSP_CREATE_CALLBACK ncreate$(long struct) { return FMOD_DSP_CREATE_CALLBACK.createSafe(memGetAddress(struct + FMOD_DSP_DESCRIPTION.CREATE)); }
    /** Unsafe version of {@link #release}. */
    @Nullable public static FMOD_DSP_RELEASE_CALLBACK nrelease(long struct) { return FMOD_DSP_RELEASE_CALLBACK.createSafe(memGetAddress(struct + FMOD_DSP_DESCRIPTION.RELEASE)); }
    /** Unsafe version of {@link #reset$}. */
    public static FMOD_DSP_RESET_CALLBACK nreset$(long struct) { return FMOD_DSP_RESET_CALLBACK.create(memGetAddress(struct + FMOD_DSP_DESCRIPTION.RESET)); }
    /** Unsafe version of {@link #read}. */
    @Nullable public static FMOD_DSP_READ_CALLBACK nread(long struct) { return FMOD_DSP_READ_CALLBACK.createSafe(memGetAddress(struct + FMOD_DSP_DESCRIPTION.READ)); }
    /** Unsafe version of {@link #process}. */
    @Nullable public static FMOD_DSP_PROCESS_CALLBACK nprocess(long struct) { return FMOD_DSP_PROCESS_CALLBACK.createSafe(memGetAddress(struct + FMOD_DSP_DESCRIPTION.PROCESS)); }
    /** Unsafe version of {@link #setposition}. */
    @Nullable public static FMOD_DSP_SETPOSITION_CALLBACK nsetposition(long struct) { return FMOD_DSP_SETPOSITION_CALLBACK.createSafe(memGetAddress(struct + FMOD_DSP_DESCRIPTION.SETPOSITION)); }
    /** Unsafe version of {@link #numparameters}. */
    public static int nnumparameters(long struct) { return UNSAFE.getInt(null, struct + FMOD_DSP_DESCRIPTION.NUMPARAMETERS); }
    /** Unsafe version of {@link #paramdesc() paramdesc}. */
    public static PointerBuffer nparamdesc(long struct) { return memPointerBuffer(memGetAddress(struct + FMOD_DSP_DESCRIPTION.PARAMDESC), nnumparameters(struct)); }
    /** Unsafe version of {@link #setparameterfloat}. */
    @Nullable public static FMOD_DSP_SETPARAM_FLOAT_CALLBACK nsetparameterfloat(long struct) { return FMOD_DSP_SETPARAM_FLOAT_CALLBACK.createSafe(memGetAddress(struct + FMOD_DSP_DESCRIPTION.SETPARAMETERFLOAT)); }
    /** Unsafe version of {@link #setparameterint}. */
    @Nullable public static FMOD_DSP_SETPARAM_INT_CALLBACK nsetparameterint(long struct) { return FMOD_DSP_SETPARAM_INT_CALLBACK.createSafe(memGetAddress(struct + FMOD_DSP_DESCRIPTION.SETPARAMETERINT)); }
    /** Unsafe version of {@link #setparameterbool}. */
    @Nullable public static FMOD_DSP_SETPARAM_BOOL_CALLBACK nsetparameterbool(long struct) { return FMOD_DSP_SETPARAM_BOOL_CALLBACK.createSafe(memGetAddress(struct + FMOD_DSP_DESCRIPTION.SETPARAMETERBOOL)); }
    /** Unsafe version of {@link #setparameterdata}. */
    @Nullable public static FMOD_DSP_SETPARAM_DATA_CALLBACK nsetparameterdata(long struct) { return FMOD_DSP_SETPARAM_DATA_CALLBACK.createSafe(memGetAddress(struct + FMOD_DSP_DESCRIPTION.SETPARAMETERDATA)); }
    /** Unsafe version of {@link #getparameterfloat}. */
    @Nullable public static FMOD_DSP_GETPARAM_FLOAT_CALLBACK ngetparameterfloat(long struct) { return FMOD_DSP_GETPARAM_FLOAT_CALLBACK.createSafe(memGetAddress(struct + FMOD_DSP_DESCRIPTION.GETPARAMETERFLOAT)); }
    /** Unsafe version of {@link #getparameterint}. */
    @Nullable public static FMOD_DSP_GETPARAM_INT_CALLBACK ngetparameterint(long struct) { return FMOD_DSP_GETPARAM_INT_CALLBACK.createSafe(memGetAddress(struct + FMOD_DSP_DESCRIPTION.GETPARAMETERINT)); }
    /** Unsafe version of {@link #getparameterbool}. */
    @Nullable public static FMOD_DSP_GETPARAM_BOOL_CALLBACK ngetparameterbool(long struct) { return FMOD_DSP_GETPARAM_BOOL_CALLBACK.createSafe(memGetAddress(struct + FMOD_DSP_DESCRIPTION.GETPARAMETERBOOL)); }
    /** Unsafe version of {@link #getparameterdata}. */
    @Nullable public static FMOD_DSP_GETPARAM_DATA_CALLBACK ngetparameterdata(long struct) { return FMOD_DSP_GETPARAM_DATA_CALLBACK.createSafe(memGetAddress(struct + FMOD_DSP_DESCRIPTION.GETPARAMETERDATA)); }
    /** Unsafe version of {@link #shouldiprocess}. */
    public static FMOD_DSP_SHOULDIPROCESS_CALLBACK nshouldiprocess(long struct) { return FMOD_DSP_SHOULDIPROCESS_CALLBACK.create(memGetAddress(struct + FMOD_DSP_DESCRIPTION.SHOULDIPROCESS)); }
    /** Unsafe version of {@link #userdata}. */
    public static long nuserdata(long struct) { return memGetAddress(struct + FMOD_DSP_DESCRIPTION.USERDATA); }
    /** Unsafe version of {@link #sys_register}. */
    @Nullable public static FMOD_DSP_SYSTEM_REGISTER_CALLBACK nsys_register(long struct) { return FMOD_DSP_SYSTEM_REGISTER_CALLBACK.createSafe(memGetAddress(struct + FMOD_DSP_DESCRIPTION.SYS_REGISTER)); }
    /** Unsafe version of {@link #sys_deregister}. */
    @Nullable public static FMOD_DSP_SYSTEM_DEREGISTER_CALLBACK nsys_deregister(long struct) { return FMOD_DSP_SYSTEM_DEREGISTER_CALLBACK.createSafe(memGetAddress(struct + FMOD_DSP_DESCRIPTION.SYS_DEREGISTER)); }
    /** Unsafe version of {@link #sys_mix}. */
    @Nullable public static FMOD_DSP_SYSTEM_MIX_CALLBACK nsys_mix(long struct) { return FMOD_DSP_SYSTEM_MIX_CALLBACK.createSafe(memGetAddress(struct + FMOD_DSP_DESCRIPTION.SYS_MIX)); }

    /** Unsafe version of {@link #pluginsdkversion(int) pluginsdkversion}. */
    public static void npluginsdkversion(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_DSP_DESCRIPTION.PLUGINSDKVERSION, value); }
    /** Unsafe version of {@link #name(ByteBuffer) name}. */
    public static void nname(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 32); }
        memCopy(memAddress(value), struct + FMOD_DSP_DESCRIPTION.NAME, value.remaining() * 1);
    }
    /** Unsafe version of {@link #name(int, byte) name}. */
    public static void nname(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + FMOD_DSP_DESCRIPTION.NAME + check(index, 32) * 1, value);
    }
    /** Unsafe version of {@link #version(int) version}. */
    public static void nversion(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_DSP_DESCRIPTION.VERSION, value); }
    /** Unsafe version of {@link #numinputbuffers(int) numinputbuffers}. */
    public static void nnuminputbuffers(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_DSP_DESCRIPTION.NUMINPUTBUFFERS, value); }
    /** Unsafe version of {@link #numoutputbuffers(int) numoutputbuffers}. */
    public static void nnumoutputbuffers(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_DSP_DESCRIPTION.NUMOUTPUTBUFFERS, value); }
    /** Unsafe version of {@link #create$(FMOD_DSP_CREATE_CALLBACKI) create$}. */
    public static void ncreate$(long struct, @Nullable FMOD_DSP_CREATE_CALLBACKI value) { memPutAddress(struct + FMOD_DSP_DESCRIPTION.CREATE, memAddressSafe(value)); }
    /** Unsafe version of {@link #release(FMOD_DSP_RELEASE_CALLBACKI) release}. */
    public static void nrelease(long struct, @Nullable FMOD_DSP_RELEASE_CALLBACKI value) { memPutAddress(struct + FMOD_DSP_DESCRIPTION.RELEASE, memAddressSafe(value)); }
    /** Unsafe version of {@link #reset$(FMOD_DSP_RESET_CALLBACKI) reset$}. */
    public static void nreset$(long struct, FMOD_DSP_RESET_CALLBACKI value) { memPutAddress(struct + FMOD_DSP_DESCRIPTION.RESET, value.address()); }
    /** Unsafe version of {@link #read(FMOD_DSP_READ_CALLBACKI) read}. */
    public static void nread(long struct, @Nullable FMOD_DSP_READ_CALLBACKI value) { memPutAddress(struct + FMOD_DSP_DESCRIPTION.READ, memAddressSafe(value)); }
    /** Unsafe version of {@link #process(FMOD_DSP_PROCESS_CALLBACKI) process}. */
    public static void nprocess(long struct, @Nullable FMOD_DSP_PROCESS_CALLBACKI value) { memPutAddress(struct + FMOD_DSP_DESCRIPTION.PROCESS, memAddressSafe(value)); }
    /** Unsafe version of {@link #setposition(FMOD_DSP_SETPOSITION_CALLBACKI) setposition}. */
    public static void nsetposition(long struct, @Nullable FMOD_DSP_SETPOSITION_CALLBACKI value) { memPutAddress(struct + FMOD_DSP_DESCRIPTION.SETPOSITION, memAddressSafe(value)); }
    /** Sets the specified value to the {@code numparameters} field of the specified {@code struct}. */
    public static void nnumparameters(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_DSP_DESCRIPTION.NUMPARAMETERS, value); }
    /** Unsafe version of {@link #paramdesc(PointerBuffer) paramdesc}. */
    public static void nparamdesc(long struct, PointerBuffer value) { memPutAddress(struct + FMOD_DSP_DESCRIPTION.PARAMDESC, memAddress(value)); nnumparameters(struct, value.remaining()); }
    /** Unsafe version of {@link #setparameterfloat(FMOD_DSP_SETPARAM_FLOAT_CALLBACKI) setparameterfloat}. */
    public static void nsetparameterfloat(long struct, @Nullable FMOD_DSP_SETPARAM_FLOAT_CALLBACKI value) { memPutAddress(struct + FMOD_DSP_DESCRIPTION.SETPARAMETERFLOAT, memAddressSafe(value)); }
    /** Unsafe version of {@link #setparameterint(FMOD_DSP_SETPARAM_INT_CALLBACKI) setparameterint}. */
    public static void nsetparameterint(long struct, @Nullable FMOD_DSP_SETPARAM_INT_CALLBACKI value) { memPutAddress(struct + FMOD_DSP_DESCRIPTION.SETPARAMETERINT, memAddressSafe(value)); }
    /** Unsafe version of {@link #setparameterbool(FMOD_DSP_SETPARAM_BOOL_CALLBACKI) setparameterbool}. */
    public static void nsetparameterbool(long struct, @Nullable FMOD_DSP_SETPARAM_BOOL_CALLBACKI value) { memPutAddress(struct + FMOD_DSP_DESCRIPTION.SETPARAMETERBOOL, memAddressSafe(value)); }
    /** Unsafe version of {@link #setparameterdata(FMOD_DSP_SETPARAM_DATA_CALLBACKI) setparameterdata}. */
    public static void nsetparameterdata(long struct, @Nullable FMOD_DSP_SETPARAM_DATA_CALLBACKI value) { memPutAddress(struct + FMOD_DSP_DESCRIPTION.SETPARAMETERDATA, memAddressSafe(value)); }
    /** Unsafe version of {@link #getparameterfloat(FMOD_DSP_GETPARAM_FLOAT_CALLBACKI) getparameterfloat}. */
    public static void ngetparameterfloat(long struct, @Nullable FMOD_DSP_GETPARAM_FLOAT_CALLBACKI value) { memPutAddress(struct + FMOD_DSP_DESCRIPTION.GETPARAMETERFLOAT, memAddressSafe(value)); }
    /** Unsafe version of {@link #getparameterint(FMOD_DSP_GETPARAM_INT_CALLBACKI) getparameterint}. */
    public static void ngetparameterint(long struct, @Nullable FMOD_DSP_GETPARAM_INT_CALLBACKI value) { memPutAddress(struct + FMOD_DSP_DESCRIPTION.GETPARAMETERINT, memAddressSafe(value)); }
    /** Unsafe version of {@link #getparameterbool(FMOD_DSP_GETPARAM_BOOL_CALLBACKI) getparameterbool}. */
    public static void ngetparameterbool(long struct, @Nullable FMOD_DSP_GETPARAM_BOOL_CALLBACKI value) { memPutAddress(struct + FMOD_DSP_DESCRIPTION.GETPARAMETERBOOL, memAddressSafe(value)); }
    /** Unsafe version of {@link #getparameterdata(FMOD_DSP_GETPARAM_DATA_CALLBACKI) getparameterdata}. */
    public static void ngetparameterdata(long struct, @Nullable FMOD_DSP_GETPARAM_DATA_CALLBACKI value) { memPutAddress(struct + FMOD_DSP_DESCRIPTION.GETPARAMETERDATA, memAddressSafe(value)); }
    /** Unsafe version of {@link #shouldiprocess(FMOD_DSP_SHOULDIPROCESS_CALLBACKI) shouldiprocess}. */
    public static void nshouldiprocess(long struct, FMOD_DSP_SHOULDIPROCESS_CALLBACKI value) { memPutAddress(struct + FMOD_DSP_DESCRIPTION.SHOULDIPROCESS, value.address()); }
    /** Unsafe version of {@link #userdata(long) userdata}. */
    public static void nuserdata(long struct, long value) { memPutAddress(struct + FMOD_DSP_DESCRIPTION.USERDATA, value); }
    /** Unsafe version of {@link #sys_register(FMOD_DSP_SYSTEM_REGISTER_CALLBACKI) sys_register}. */
    public static void nsys_register(long struct, @Nullable FMOD_DSP_SYSTEM_REGISTER_CALLBACKI value) { memPutAddress(struct + FMOD_DSP_DESCRIPTION.SYS_REGISTER, memAddressSafe(value)); }
    /** Unsafe version of {@link #sys_deregister(FMOD_DSP_SYSTEM_DEREGISTER_CALLBACKI) sys_deregister}. */
    public static void nsys_deregister(long struct, @Nullable FMOD_DSP_SYSTEM_DEREGISTER_CALLBACKI value) { memPutAddress(struct + FMOD_DSP_DESCRIPTION.SYS_DEREGISTER, memAddressSafe(value)); }
    /** Unsafe version of {@link #sys_mix(FMOD_DSP_SYSTEM_MIX_CALLBACKI) sys_mix}. */
    public static void nsys_mix(long struct, @Nullable FMOD_DSP_SYSTEM_MIX_CALLBACKI value) { memPutAddress(struct + FMOD_DSP_DESCRIPTION.SYS_MIX, memAddressSafe(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + FMOD_DSP_DESCRIPTION.RESET));
        check(memGetAddress(struct + FMOD_DSP_DESCRIPTION.PARAMDESC));
        check(memGetAddress(struct + FMOD_DSP_DESCRIPTION.SHOULDIPROCESS));
    }

    // -----------------------------------

    /** An array of {@link FMOD_DSP_DESCRIPTION} structs. */
    public static class Buffer extends StructBuffer<FMOD_DSP_DESCRIPTION, Buffer> implements NativeResource {

        private static final FMOD_DSP_DESCRIPTION ELEMENT_FACTORY = FMOD_DSP_DESCRIPTION.create(-1L);

        /**
         * Creates a new {@code FMOD_DSP_DESCRIPTION.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_DSP_DESCRIPTION#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_DSP_DESCRIPTION getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code pluginsdkversion} field. */
        @NativeType("unsigned int")
        public int pluginsdkversion() { return FMOD_DSP_DESCRIPTION.npluginsdkversion(address()); }
        /** @return a {@link ByteBuffer} view of the {@code name} field. */
        @NativeType("char[32]")
        public ByteBuffer name() { return FMOD_DSP_DESCRIPTION.nname(address()); }
        /** @return the value at the specified index of the {@code name} field. */
        @NativeType("char")
        public byte name(int index) { return FMOD_DSP_DESCRIPTION.nname(address(), index); }
        /** @return the value of the {@code version} field. */
        @NativeType("unsigned int")
        public int version() { return FMOD_DSP_DESCRIPTION.nversion(address()); }
        /** @return the value of the {@code numinputbuffers} field. */
        public int numinputbuffers() { return FMOD_DSP_DESCRIPTION.nnuminputbuffers(address()); }
        /** @return the value of the {@code numoutputbuffers} field. */
        public int numoutputbuffers() { return FMOD_DSP_DESCRIPTION.nnumoutputbuffers(address()); }
        /** @return the value of the {@code create} field. */
        @Nullable
        public FMOD_DSP_CREATE_CALLBACK create$() { return FMOD_DSP_DESCRIPTION.ncreate$(address()); }
        /** @return the value of the {@code release} field. */
        @Nullable
        public FMOD_DSP_RELEASE_CALLBACK release() { return FMOD_DSP_DESCRIPTION.nrelease(address()); }
        /** @return the value of the {@code reset} field. */
        public FMOD_DSP_RESET_CALLBACK reset$() { return FMOD_DSP_DESCRIPTION.nreset$(address()); }
        /** @return the value of the {@code read} field. */
        @Nullable
        public FMOD_DSP_READ_CALLBACK read() { return FMOD_DSP_DESCRIPTION.nread(address()); }
        /** @return the value of the {@code process} field. */
        @Nullable
        public FMOD_DSP_PROCESS_CALLBACK process() { return FMOD_DSP_DESCRIPTION.nprocess(address()); }
        /** @return the value of the {@code setposition} field. */
        @Nullable
        public FMOD_DSP_SETPOSITION_CALLBACK setposition() { return FMOD_DSP_DESCRIPTION.nsetposition(address()); }
        /** @return the value of the {@code numparameters} field. */
        public int numparameters() { return FMOD_DSP_DESCRIPTION.nnumparameters(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code paramdesc} field. */
        @NativeType("FMOD_DSP_PARAMETER_DESC **")
        public PointerBuffer paramdesc() { return FMOD_DSP_DESCRIPTION.nparamdesc(address()); }
        /** @return the value of the {@code setparameterfloat} field. */
        @Nullable
        public FMOD_DSP_SETPARAM_FLOAT_CALLBACK setparameterfloat() { return FMOD_DSP_DESCRIPTION.nsetparameterfloat(address()); }
        /** @return the value of the {@code setparameterint} field. */
        @Nullable
        public FMOD_DSP_SETPARAM_INT_CALLBACK setparameterint() { return FMOD_DSP_DESCRIPTION.nsetparameterint(address()); }
        /** @return the value of the {@code setparameterbool} field. */
        @Nullable
        public FMOD_DSP_SETPARAM_BOOL_CALLBACK setparameterbool() { return FMOD_DSP_DESCRIPTION.nsetparameterbool(address()); }
        /** @return the value of the {@code setparameterdata} field. */
        @Nullable
        public FMOD_DSP_SETPARAM_DATA_CALLBACK setparameterdata() { return FMOD_DSP_DESCRIPTION.nsetparameterdata(address()); }
        /** @return the value of the {@code getparameterfloat} field. */
        @Nullable
        public FMOD_DSP_GETPARAM_FLOAT_CALLBACK getparameterfloat() { return FMOD_DSP_DESCRIPTION.ngetparameterfloat(address()); }
        /** @return the value of the {@code getparameterint} field. */
        @Nullable
        public FMOD_DSP_GETPARAM_INT_CALLBACK getparameterint() { return FMOD_DSP_DESCRIPTION.ngetparameterint(address()); }
        /** @return the value of the {@code getparameterbool} field. */
        @Nullable
        public FMOD_DSP_GETPARAM_BOOL_CALLBACK getparameterbool() { return FMOD_DSP_DESCRIPTION.ngetparameterbool(address()); }
        /** @return the value of the {@code getparameterdata} field. */
        @Nullable
        public FMOD_DSP_GETPARAM_DATA_CALLBACK getparameterdata() { return FMOD_DSP_DESCRIPTION.ngetparameterdata(address()); }
        /** @return the value of the {@code shouldiprocess} field. */
        public FMOD_DSP_SHOULDIPROCESS_CALLBACK shouldiprocess() { return FMOD_DSP_DESCRIPTION.nshouldiprocess(address()); }
        /** @return the value of the {@code userdata} field. */
        @NativeType("void *")
        public long userdata() { return FMOD_DSP_DESCRIPTION.nuserdata(address()); }
        /** @return the value of the {@code sys_register} field. */
        @Nullable
        public FMOD_DSP_SYSTEM_REGISTER_CALLBACK sys_register() { return FMOD_DSP_DESCRIPTION.nsys_register(address()); }
        /** @return the value of the {@code sys_deregister} field. */
        @Nullable
        public FMOD_DSP_SYSTEM_DEREGISTER_CALLBACK sys_deregister() { return FMOD_DSP_DESCRIPTION.nsys_deregister(address()); }
        /** @return the value of the {@code sys_mix} field. */
        @Nullable
        public FMOD_DSP_SYSTEM_MIX_CALLBACK sys_mix() { return FMOD_DSP_DESCRIPTION.nsys_mix(address()); }

        /** Sets the specified value to the {@code pluginsdkversion} field. */
        public FMOD_DSP_DESCRIPTION.Buffer pluginsdkversion(@NativeType("unsigned int") int value) { FMOD_DSP_DESCRIPTION.npluginsdkversion(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code name} field. */
        public FMOD_DSP_DESCRIPTION.Buffer name(@NativeType("char[32]") ByteBuffer value) { FMOD_DSP_DESCRIPTION.nname(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code name} field. */
        public FMOD_DSP_DESCRIPTION.Buffer name(int index, @NativeType("char") byte value) { FMOD_DSP_DESCRIPTION.nname(address(), index, value); return this; }
        /** Sets the specified value to the {@code version} field. */
        public FMOD_DSP_DESCRIPTION.Buffer version(@NativeType("unsigned int") int value) { FMOD_DSP_DESCRIPTION.nversion(address(), value); return this; }
        /** Sets the specified value to the {@code numinputbuffers} field. */
        public FMOD_DSP_DESCRIPTION.Buffer numinputbuffers(int value) { FMOD_DSP_DESCRIPTION.nnuminputbuffers(address(), value); return this; }
        /** Sets the specified value to the {@code numoutputbuffers} field. */
        public FMOD_DSP_DESCRIPTION.Buffer numoutputbuffers(int value) { FMOD_DSP_DESCRIPTION.nnumoutputbuffers(address(), value); return this; }
        /** Sets the specified value to the {@code create} field. */
        public FMOD_DSP_DESCRIPTION.Buffer create$(@Nullable @NativeType("FMOD_DSP_CREATE_CALLBACK") FMOD_DSP_CREATE_CALLBACKI value) { FMOD_DSP_DESCRIPTION.ncreate$(address(), value); return this; }
        /** Sets the specified value to the {@code release} field. */
        public FMOD_DSP_DESCRIPTION.Buffer release(@Nullable @NativeType("FMOD_DSP_RELEASE_CALLBACK") FMOD_DSP_RELEASE_CALLBACKI value) { FMOD_DSP_DESCRIPTION.nrelease(address(), value); return this; }
        /** Sets the specified value to the {@code reset} field. */
        public FMOD_DSP_DESCRIPTION.Buffer reset$(@NativeType("FMOD_DSP_RESET_CALLBACK") FMOD_DSP_RESET_CALLBACKI value) { FMOD_DSP_DESCRIPTION.nreset$(address(), value); return this; }
        /** Sets the specified value to the {@code read} field. */
        public FMOD_DSP_DESCRIPTION.Buffer read(@Nullable @NativeType("FMOD_DSP_READ_CALLBACK") FMOD_DSP_READ_CALLBACKI value) { FMOD_DSP_DESCRIPTION.nread(address(), value); return this; }
        /** Sets the specified value to the {@code process} field. */
        public FMOD_DSP_DESCRIPTION.Buffer process(@Nullable @NativeType("FMOD_DSP_PROCESS_CALLBACK") FMOD_DSP_PROCESS_CALLBACKI value) { FMOD_DSP_DESCRIPTION.nprocess(address(), value); return this; }
        /** Sets the specified value to the {@code setposition} field. */
        public FMOD_DSP_DESCRIPTION.Buffer setposition(@Nullable @NativeType("FMOD_DSP_SETPOSITION_CALLBACK") FMOD_DSP_SETPOSITION_CALLBACKI value) { FMOD_DSP_DESCRIPTION.nsetposition(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code paramdesc} field. */
        public FMOD_DSP_DESCRIPTION.Buffer paramdesc(@NativeType("FMOD_DSP_PARAMETER_DESC **") PointerBuffer value) { FMOD_DSP_DESCRIPTION.nparamdesc(address(), value); return this; }
        /** Sets the specified value to the {@code setparameterfloat} field. */
        public FMOD_DSP_DESCRIPTION.Buffer setparameterfloat(@Nullable @NativeType("FMOD_DSP_SETPARAM_FLOAT_CALLBACK") FMOD_DSP_SETPARAM_FLOAT_CALLBACKI value) { FMOD_DSP_DESCRIPTION.nsetparameterfloat(address(), value); return this; }
        /** Sets the specified value to the {@code setparameterint} field. */
        public FMOD_DSP_DESCRIPTION.Buffer setparameterint(@Nullable @NativeType("FMOD_DSP_SETPARAM_INT_CALLBACK") FMOD_DSP_SETPARAM_INT_CALLBACKI value) { FMOD_DSP_DESCRIPTION.nsetparameterint(address(), value); return this; }
        /** Sets the specified value to the {@code setparameterbool} field. */
        public FMOD_DSP_DESCRIPTION.Buffer setparameterbool(@Nullable @NativeType("FMOD_DSP_SETPARAM_BOOL_CALLBACK") FMOD_DSP_SETPARAM_BOOL_CALLBACKI value) { FMOD_DSP_DESCRIPTION.nsetparameterbool(address(), value); return this; }
        /** Sets the specified value to the {@code setparameterdata} field. */
        public FMOD_DSP_DESCRIPTION.Buffer setparameterdata(@Nullable @NativeType("FMOD_DSP_SETPARAM_DATA_CALLBACK") FMOD_DSP_SETPARAM_DATA_CALLBACKI value) { FMOD_DSP_DESCRIPTION.nsetparameterdata(address(), value); return this; }
        /** Sets the specified value to the {@code getparameterfloat} field. */
        public FMOD_DSP_DESCRIPTION.Buffer getparameterfloat(@Nullable @NativeType("FMOD_DSP_GETPARAM_FLOAT_CALLBACK") FMOD_DSP_GETPARAM_FLOAT_CALLBACKI value) { FMOD_DSP_DESCRIPTION.ngetparameterfloat(address(), value); return this; }
        /** Sets the specified value to the {@code getparameterint} field. */
        public FMOD_DSP_DESCRIPTION.Buffer getparameterint(@Nullable @NativeType("FMOD_DSP_GETPARAM_INT_CALLBACK") FMOD_DSP_GETPARAM_INT_CALLBACKI value) { FMOD_DSP_DESCRIPTION.ngetparameterint(address(), value); return this; }
        /** Sets the specified value to the {@code getparameterbool} field. */
        public FMOD_DSP_DESCRIPTION.Buffer getparameterbool(@Nullable @NativeType("FMOD_DSP_GETPARAM_BOOL_CALLBACK") FMOD_DSP_GETPARAM_BOOL_CALLBACKI value) { FMOD_DSP_DESCRIPTION.ngetparameterbool(address(), value); return this; }
        /** Sets the specified value to the {@code getparameterdata} field. */
        public FMOD_DSP_DESCRIPTION.Buffer getparameterdata(@Nullable @NativeType("FMOD_DSP_GETPARAM_DATA_CALLBACK") FMOD_DSP_GETPARAM_DATA_CALLBACKI value) { FMOD_DSP_DESCRIPTION.ngetparameterdata(address(), value); return this; }
        /** Sets the specified value to the {@code shouldiprocess} field. */
        public FMOD_DSP_DESCRIPTION.Buffer shouldiprocess(@NativeType("FMOD_DSP_SHOULDIPROCESS_CALLBACK") FMOD_DSP_SHOULDIPROCESS_CALLBACKI value) { FMOD_DSP_DESCRIPTION.nshouldiprocess(address(), value); return this; }
        /** Sets the specified value to the {@code userdata} field. */
        public FMOD_DSP_DESCRIPTION.Buffer userdata(@NativeType("void *") long value) { FMOD_DSP_DESCRIPTION.nuserdata(address(), value); return this; }
        /** Sets the specified value to the {@code sys_register} field. */
        public FMOD_DSP_DESCRIPTION.Buffer sys_register(@Nullable @NativeType("FMOD_DSP_SYSTEM_REGISTER_CALLBACK") FMOD_DSP_SYSTEM_REGISTER_CALLBACKI value) { FMOD_DSP_DESCRIPTION.nsys_register(address(), value); return this; }
        /** Sets the specified value to the {@code sys_deregister} field. */
        public FMOD_DSP_DESCRIPTION.Buffer sys_deregister(@Nullable @NativeType("FMOD_DSP_SYSTEM_DEREGISTER_CALLBACK") FMOD_DSP_SYSTEM_DEREGISTER_CALLBACKI value) { FMOD_DSP_DESCRIPTION.nsys_deregister(address(), value); return this; }
        /** Sets the specified value to the {@code sys_mix} field. */
        public FMOD_DSP_DESCRIPTION.Buffer sys_mix(@Nullable @NativeType("FMOD_DSP_SYSTEM_MIX_CALLBACK") FMOD_DSP_SYSTEM_MIX_CALLBACKI value) { FMOD_DSP_DESCRIPTION.nsys_mix(address(), value); return this; }

    }

}