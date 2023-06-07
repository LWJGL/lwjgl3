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
 * Output structures
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FMOD_OUTPUT_DESCRIPTION {
 *     unsigned int apiversion;
 *     char const * name;
 *     unsigned int version;
 *     FMOD_OUTPUT_METHOD method;
 *     {@link FMOD_OUTPUT_GETNUMDRIVERS_CALLBACKI FMOD_OUTPUT_GETNUMDRIVERS_CALLBACK} getnumdrivers;
 *     {@link FMOD_OUTPUT_GETDRIVERINFO_CALLBACKI FMOD_OUTPUT_GETDRIVERINFO_CALLBACK} getdriverinfo;
 *     {@link FMOD_OUTPUT_INIT_CALLBACKI FMOD_OUTPUT_INIT_CALLBACK} init;
 *     {@link FMOD_OUTPUT_START_CALLBACKI FMOD_OUTPUT_START_CALLBACK} start;
 *     {@link FMOD_OUTPUT_STOP_CALLBACKI FMOD_OUTPUT_STOP_CALLBACK} stop;
 *     {@link FMOD_OUTPUT_CLOSE_CALLBACKI FMOD_OUTPUT_CLOSE_CALLBACK} close;
 *     {@link FMOD_OUTPUT_UPDATE_CALLBACKI FMOD_OUTPUT_UPDATE_CALLBACK} update;
 *     {@link FMOD_OUTPUT_GETHANDLE_CALLBACKI FMOD_OUTPUT_GETHANDLE_CALLBACK} gethandle;
 *     {@link FMOD_OUTPUT_MIXER_CALLBACKI FMOD_OUTPUT_MIXER_CALLBACK} mixer;
 *     {@link FMOD_OUTPUT_OBJECT3DGETINFO_CALLBACKI FMOD_OUTPUT_OBJECT3DGETINFO_CALLBACK} object3dgetinfo;
 *     {@link FMOD_OUTPUT_OBJECT3DALLOC_CALLBACKI FMOD_OUTPUT_OBJECT3DALLOC_CALLBACK} object3dalloc;
 *     {@link FMOD_OUTPUT_OBJECT3DFREE_CALLBACKI FMOD_OUTPUT_OBJECT3DFREE_CALLBACK} object3dfree;
 *     {@link FMOD_OUTPUT_OBJECT3DUPDATE_CALLBACKI FMOD_OUTPUT_OBJECT3DUPDATE_CALLBACK} object3dupdate;
 *     {@link FMOD_OUTPUT_OPENPORT_CALLBACKI FMOD_OUTPUT_OPENPORT_CALLBACK} openport;
 *     {@link FMOD_OUTPUT_CLOSEPORT_CALLBACKI FMOD_OUTPUT_CLOSEPORT_CALLBACK} closeport;
 *     {@link FMOD_OUTPUT_DEVICELISTCHANGED_CALLBACKI FMOD_OUTPUT_DEVICELISTCHANGED_CALLBACK} devicelistchanged;
 * }</code></pre>
 */
public class FMOD_OUTPUT_DESCRIPTION extends Struct<FMOD_OUTPUT_DESCRIPTION> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        APIVERSION,
        NAME,
        VERSION,
        METHOD,
        GETNUMDRIVERS,
        GETDRIVERINFO,
        INIT,
        START,
        STOP,
        CLOSE,
        UPDATE,
        GETHANDLE,
        MIXER,
        OBJECT3DGETINFO,
        OBJECT3DALLOC,
        OBJECT3DFREE,
        OBJECT3DUPDATE,
        OPENPORT,
        CLOSEPORT,
        DEVICELISTCHANGED;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
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
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        APIVERSION = layout.offsetof(0);
        NAME = layout.offsetof(1);
        VERSION = layout.offsetof(2);
        METHOD = layout.offsetof(3);
        GETNUMDRIVERS = layout.offsetof(4);
        GETDRIVERINFO = layout.offsetof(5);
        INIT = layout.offsetof(6);
        START = layout.offsetof(7);
        STOP = layout.offsetof(8);
        CLOSE = layout.offsetof(9);
        UPDATE = layout.offsetof(10);
        GETHANDLE = layout.offsetof(11);
        MIXER = layout.offsetof(12);
        OBJECT3DGETINFO = layout.offsetof(13);
        OBJECT3DALLOC = layout.offsetof(14);
        OBJECT3DFREE = layout.offsetof(15);
        OBJECT3DUPDATE = layout.offsetof(16);
        OPENPORT = layout.offsetof(17);
        CLOSEPORT = layout.offsetof(18);
        DEVICELISTCHANGED = layout.offsetof(19);
    }

    protected FMOD_OUTPUT_DESCRIPTION(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_OUTPUT_DESCRIPTION create(long address, @Nullable ByteBuffer container) {
        return new FMOD_OUTPUT_DESCRIPTION(address, container);
    }

    /**
     * Creates a {@code FMOD_OUTPUT_DESCRIPTION} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_OUTPUT_DESCRIPTION(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code apiversion} field. */
    @NativeType("unsigned int")
    public int apiversion() { return napiversion(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
    @NativeType("char const *")
    public ByteBuffer name() { return nname(address()); }
    /** @return the null-terminated string pointed to by the {@code name} field. */
    @NativeType("char const *")
    public String nameString() { return nnameString(address()); }
    /** @return the value of the {@code version} field. */
    @NativeType("unsigned int")
    public int version() { return nversion(address()); }
    /** @return the value of the {@code method} field. */
    @NativeType("FMOD_OUTPUT_METHOD")
    public int method() { return nmethod(address()); }
    /** @return the value of the {@code getnumdrivers} field. */
    public FMOD_OUTPUT_GETNUMDRIVERS_CALLBACK getnumdrivers() { return ngetnumdrivers(address()); }
    /** @return the value of the {@code getdriverinfo} field. */
    public FMOD_OUTPUT_GETDRIVERINFO_CALLBACK getdriverinfo() { return ngetdriverinfo(address()); }
    /** @return the value of the {@code init} field. */
    public FMOD_OUTPUT_INIT_CALLBACK init() { return ninit(address()); }
    /** @return the value of the {@code start} field. */
    @Nullable
    public FMOD_OUTPUT_START_CALLBACK start() { return nstart(address()); }
    /** @return the value of the {@code stop} field. */
    @Nullable
    public FMOD_OUTPUT_STOP_CALLBACK stop() { return nstop(address()); }
    /** @return the value of the {@code close} field. */
    @Nullable
    public FMOD_OUTPUT_CLOSE_CALLBACK close$() { return nclose$(address()); }
    /** @return the value of the {@code update} field. */
    @Nullable
    public FMOD_OUTPUT_UPDATE_CALLBACK update() { return nupdate(address()); }
    /** @return the value of the {@code gethandle} field. */
    @Nullable
    public FMOD_OUTPUT_GETHANDLE_CALLBACK gethandle() { return ngethandle(address()); }
    /** @return the value of the {@code mixer} field. */
    @Nullable
    public FMOD_OUTPUT_MIXER_CALLBACK mixer() { return nmixer(address()); }
    /** @return the value of the {@code object3dgetinfo} field. */
    @Nullable
    public FMOD_OUTPUT_OBJECT3DGETINFO_CALLBACK object3dgetinfo() { return nobject3dgetinfo(address()); }
    /** @return the value of the {@code object3dalloc} field. */
    @Nullable
    public FMOD_OUTPUT_OBJECT3DALLOC_CALLBACK object3dalloc() { return nobject3dalloc(address()); }
    /** @return the value of the {@code object3dfree} field. */
    @Nullable
    public FMOD_OUTPUT_OBJECT3DFREE_CALLBACK object3dfree() { return nobject3dfree(address()); }
    /** @return the value of the {@code object3dupdate} field. */
    @Nullable
    public FMOD_OUTPUT_OBJECT3DUPDATE_CALLBACK object3dupdate() { return nobject3dupdate(address()); }
    /** @return the value of the {@code openport} field. */
    @Nullable
    public FMOD_OUTPUT_OPENPORT_CALLBACK openport() { return nopenport(address()); }
    /** @return the value of the {@code closeport} field. */
    @Nullable
    public FMOD_OUTPUT_CLOSEPORT_CALLBACK closeport() { return ncloseport(address()); }
    /** @return the value of the {@code devicelistchanged} field. */
    @Nullable
    public FMOD_OUTPUT_DEVICELISTCHANGED_CALLBACK devicelistchanged() { return ndevicelistchanged(address()); }

    /** Sets the specified value to the {@code apiversion} field. */
    public FMOD_OUTPUT_DESCRIPTION apiversion(@NativeType("unsigned int") int value) { napiversion(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code name} field. */
    public FMOD_OUTPUT_DESCRIPTION name(@NativeType("char const *") ByteBuffer value) { nname(address(), value); return this; }
    /** Sets the specified value to the {@code version} field. */
    public FMOD_OUTPUT_DESCRIPTION version(@NativeType("unsigned int") int value) { nversion(address(), value); return this; }
    /** Sets the specified value to the {@code method} field. */
    public FMOD_OUTPUT_DESCRIPTION method(@NativeType("FMOD_OUTPUT_METHOD") int value) { nmethod(address(), value); return this; }
    /** Sets the specified value to the {@code getnumdrivers} field. */
    public FMOD_OUTPUT_DESCRIPTION getnumdrivers(@NativeType("FMOD_OUTPUT_GETNUMDRIVERS_CALLBACK") FMOD_OUTPUT_GETNUMDRIVERS_CALLBACKI value) { ngetnumdrivers(address(), value); return this; }
    /** Sets the specified value to the {@code getdriverinfo} field. */
    public FMOD_OUTPUT_DESCRIPTION getdriverinfo(@NativeType("FMOD_OUTPUT_GETDRIVERINFO_CALLBACK") FMOD_OUTPUT_GETDRIVERINFO_CALLBACKI value) { ngetdriverinfo(address(), value); return this; }
    /** Sets the specified value to the {@code init} field. */
    public FMOD_OUTPUT_DESCRIPTION init(@NativeType("FMOD_OUTPUT_INIT_CALLBACK") FMOD_OUTPUT_INIT_CALLBACKI value) { ninit(address(), value); return this; }
    /** Sets the specified value to the {@code start} field. */
    public FMOD_OUTPUT_DESCRIPTION start(@Nullable @NativeType("FMOD_OUTPUT_START_CALLBACK") FMOD_OUTPUT_START_CALLBACKI value) { nstart(address(), value); return this; }
    /** Sets the specified value to the {@code stop} field. */
    public FMOD_OUTPUT_DESCRIPTION stop(@Nullable @NativeType("FMOD_OUTPUT_STOP_CALLBACK") FMOD_OUTPUT_STOP_CALLBACKI value) { nstop(address(), value); return this; }
    /** Sets the specified value to the {@code close} field. */
    public FMOD_OUTPUT_DESCRIPTION close$(@Nullable @NativeType("FMOD_OUTPUT_CLOSE_CALLBACK") FMOD_OUTPUT_CLOSE_CALLBACKI value) { nclose$(address(), value); return this; }
    /** Sets the specified value to the {@code update} field. */
    public FMOD_OUTPUT_DESCRIPTION update(@Nullable @NativeType("FMOD_OUTPUT_UPDATE_CALLBACK") FMOD_OUTPUT_UPDATE_CALLBACKI value) { nupdate(address(), value); return this; }
    /** Sets the specified value to the {@code gethandle} field. */
    public FMOD_OUTPUT_DESCRIPTION gethandle(@Nullable @NativeType("FMOD_OUTPUT_GETHANDLE_CALLBACK") FMOD_OUTPUT_GETHANDLE_CALLBACKI value) { ngethandle(address(), value); return this; }
    /** Sets the specified value to the {@code mixer} field. */
    public FMOD_OUTPUT_DESCRIPTION mixer(@Nullable @NativeType("FMOD_OUTPUT_MIXER_CALLBACK") FMOD_OUTPUT_MIXER_CALLBACKI value) { nmixer(address(), value); return this; }
    /** Sets the specified value to the {@code object3dgetinfo} field. */
    public FMOD_OUTPUT_DESCRIPTION object3dgetinfo(@Nullable @NativeType("FMOD_OUTPUT_OBJECT3DGETINFO_CALLBACK") FMOD_OUTPUT_OBJECT3DGETINFO_CALLBACKI value) { nobject3dgetinfo(address(), value); return this; }
    /** Sets the specified value to the {@code object3dalloc} field. */
    public FMOD_OUTPUT_DESCRIPTION object3dalloc(@Nullable @NativeType("FMOD_OUTPUT_OBJECT3DALLOC_CALLBACK") FMOD_OUTPUT_OBJECT3DALLOC_CALLBACKI value) { nobject3dalloc(address(), value); return this; }
    /** Sets the specified value to the {@code object3dfree} field. */
    public FMOD_OUTPUT_DESCRIPTION object3dfree(@Nullable @NativeType("FMOD_OUTPUT_OBJECT3DFREE_CALLBACK") FMOD_OUTPUT_OBJECT3DFREE_CALLBACKI value) { nobject3dfree(address(), value); return this; }
    /** Sets the specified value to the {@code object3dupdate} field. */
    public FMOD_OUTPUT_DESCRIPTION object3dupdate(@Nullable @NativeType("FMOD_OUTPUT_OBJECT3DUPDATE_CALLBACK") FMOD_OUTPUT_OBJECT3DUPDATE_CALLBACKI value) { nobject3dupdate(address(), value); return this; }
    /** Sets the specified value to the {@code openport} field. */
    public FMOD_OUTPUT_DESCRIPTION openport(@Nullable @NativeType("FMOD_OUTPUT_OPENPORT_CALLBACK") FMOD_OUTPUT_OPENPORT_CALLBACKI value) { nopenport(address(), value); return this; }
    /** Sets the specified value to the {@code closeport} field. */
    public FMOD_OUTPUT_DESCRIPTION closeport(@Nullable @NativeType("FMOD_OUTPUT_CLOSEPORT_CALLBACK") FMOD_OUTPUT_CLOSEPORT_CALLBACKI value) { ncloseport(address(), value); return this; }
    /** Sets the specified value to the {@code devicelistchanged} field. */
    public FMOD_OUTPUT_DESCRIPTION devicelistchanged(@Nullable @NativeType("FMOD_OUTPUT_DEVICELISTCHANGED_CALLBACK") FMOD_OUTPUT_DEVICELISTCHANGED_CALLBACKI value) { ndevicelistchanged(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_OUTPUT_DESCRIPTION set(
        int apiversion,
        ByteBuffer name,
        int version,
        int method,
        FMOD_OUTPUT_GETNUMDRIVERS_CALLBACKI getnumdrivers,
        FMOD_OUTPUT_GETDRIVERINFO_CALLBACKI getdriverinfo,
        FMOD_OUTPUT_INIT_CALLBACKI init,
        @Nullable FMOD_OUTPUT_START_CALLBACKI start,
        @Nullable FMOD_OUTPUT_STOP_CALLBACKI stop,
        @Nullable FMOD_OUTPUT_CLOSE_CALLBACKI close$,
        @Nullable FMOD_OUTPUT_UPDATE_CALLBACKI update,
        @Nullable FMOD_OUTPUT_GETHANDLE_CALLBACKI gethandle,
        @Nullable FMOD_OUTPUT_MIXER_CALLBACKI mixer,
        @Nullable FMOD_OUTPUT_OBJECT3DGETINFO_CALLBACKI object3dgetinfo,
        @Nullable FMOD_OUTPUT_OBJECT3DALLOC_CALLBACKI object3dalloc,
        @Nullable FMOD_OUTPUT_OBJECT3DFREE_CALLBACKI object3dfree,
        @Nullable FMOD_OUTPUT_OBJECT3DUPDATE_CALLBACKI object3dupdate,
        @Nullable FMOD_OUTPUT_OPENPORT_CALLBACKI openport,
        @Nullable FMOD_OUTPUT_CLOSEPORT_CALLBACKI closeport,
        @Nullable FMOD_OUTPUT_DEVICELISTCHANGED_CALLBACKI devicelistchanged
    ) {
        apiversion(apiversion);
        name(name);
        version(version);
        method(method);
        getnumdrivers(getnumdrivers);
        getdriverinfo(getdriverinfo);
        init(init);
        start(start);
        stop(stop);
        close$(close$);
        update(update);
        gethandle(gethandle);
        mixer(mixer);
        object3dgetinfo(object3dgetinfo);
        object3dalloc(object3dalloc);
        object3dfree(object3dfree);
        object3dupdate(object3dupdate);
        openport(openport);
        closeport(closeport);
        devicelistchanged(devicelistchanged);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_OUTPUT_DESCRIPTION set(FMOD_OUTPUT_DESCRIPTION src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_OUTPUT_DESCRIPTION} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_OUTPUT_DESCRIPTION malloc() {
        return new FMOD_OUTPUT_DESCRIPTION(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_OUTPUT_DESCRIPTION} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_OUTPUT_DESCRIPTION calloc() {
        return new FMOD_OUTPUT_DESCRIPTION(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_OUTPUT_DESCRIPTION} instance allocated with {@link BufferUtils}. */
    public static FMOD_OUTPUT_DESCRIPTION create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_OUTPUT_DESCRIPTION(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_OUTPUT_DESCRIPTION} instance for the specified memory address. */
    public static FMOD_OUTPUT_DESCRIPTION create(long address) {
        return new FMOD_OUTPUT_DESCRIPTION(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_OUTPUT_DESCRIPTION createSafe(long address) {
        return address == NULL ? null : new FMOD_OUTPUT_DESCRIPTION(address, null);
    }

    /**
     * Returns a new {@link FMOD_OUTPUT_DESCRIPTION.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_OUTPUT_DESCRIPTION.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_OUTPUT_DESCRIPTION.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_OUTPUT_DESCRIPTION.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_OUTPUT_DESCRIPTION.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_OUTPUT_DESCRIPTION.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_OUTPUT_DESCRIPTION.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_OUTPUT_DESCRIPTION.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_OUTPUT_DESCRIPTION.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_OUTPUT_DESCRIPTION} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_OUTPUT_DESCRIPTION malloc(MemoryStack stack) {
        return new FMOD_OUTPUT_DESCRIPTION(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_OUTPUT_DESCRIPTION} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_OUTPUT_DESCRIPTION calloc(MemoryStack stack) {
        return new FMOD_OUTPUT_DESCRIPTION(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_OUTPUT_DESCRIPTION.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_OUTPUT_DESCRIPTION.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_OUTPUT_DESCRIPTION.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_OUTPUT_DESCRIPTION.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #apiversion}. */
    public static int napiversion(long struct) { return UNSAFE.getInt(null, struct + FMOD_OUTPUT_DESCRIPTION.APIVERSION); }
    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBufferNT1(memGetAddress(struct + FMOD_OUTPUT_DESCRIPTION.NAME)); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memUTF8(memGetAddress(struct + FMOD_OUTPUT_DESCRIPTION.NAME)); }
    /** Unsafe version of {@link #version}. */
    public static int nversion(long struct) { return UNSAFE.getInt(null, struct + FMOD_OUTPUT_DESCRIPTION.VERSION); }
    /** Unsafe version of {@link #method}. */
    public static int nmethod(long struct) { return UNSAFE.getInt(null, struct + FMOD_OUTPUT_DESCRIPTION.METHOD); }
    /** Unsafe version of {@link #getnumdrivers}. */
    public static FMOD_OUTPUT_GETNUMDRIVERS_CALLBACK ngetnumdrivers(long struct) { return FMOD_OUTPUT_GETNUMDRIVERS_CALLBACK.create(memGetAddress(struct + FMOD_OUTPUT_DESCRIPTION.GETNUMDRIVERS)); }
    /** Unsafe version of {@link #getdriverinfo}. */
    public static FMOD_OUTPUT_GETDRIVERINFO_CALLBACK ngetdriverinfo(long struct) { return FMOD_OUTPUT_GETDRIVERINFO_CALLBACK.create(memGetAddress(struct + FMOD_OUTPUT_DESCRIPTION.GETDRIVERINFO)); }
    /** Unsafe version of {@link #init}. */
    public static FMOD_OUTPUT_INIT_CALLBACK ninit(long struct) { return FMOD_OUTPUT_INIT_CALLBACK.create(memGetAddress(struct + FMOD_OUTPUT_DESCRIPTION.INIT)); }
    /** Unsafe version of {@link #start}. */
    @Nullable public static FMOD_OUTPUT_START_CALLBACK nstart(long struct) { return FMOD_OUTPUT_START_CALLBACK.createSafe(memGetAddress(struct + FMOD_OUTPUT_DESCRIPTION.START)); }
    /** Unsafe version of {@link #stop}. */
    @Nullable public static FMOD_OUTPUT_STOP_CALLBACK nstop(long struct) { return FMOD_OUTPUT_STOP_CALLBACK.createSafe(memGetAddress(struct + FMOD_OUTPUT_DESCRIPTION.STOP)); }
    /** Unsafe version of {@link #close$}. */
    @Nullable public static FMOD_OUTPUT_CLOSE_CALLBACK nclose$(long struct) { return FMOD_OUTPUT_CLOSE_CALLBACK.createSafe(memGetAddress(struct + FMOD_OUTPUT_DESCRIPTION.CLOSE)); }
    /** Unsafe version of {@link #update}. */
    @Nullable public static FMOD_OUTPUT_UPDATE_CALLBACK nupdate(long struct) { return FMOD_OUTPUT_UPDATE_CALLBACK.createSafe(memGetAddress(struct + FMOD_OUTPUT_DESCRIPTION.UPDATE)); }
    /** Unsafe version of {@link #gethandle}. */
    @Nullable public static FMOD_OUTPUT_GETHANDLE_CALLBACK ngethandle(long struct) { return FMOD_OUTPUT_GETHANDLE_CALLBACK.createSafe(memGetAddress(struct + FMOD_OUTPUT_DESCRIPTION.GETHANDLE)); }
    /** Unsafe version of {@link #mixer}. */
    @Nullable public static FMOD_OUTPUT_MIXER_CALLBACK nmixer(long struct) { return FMOD_OUTPUT_MIXER_CALLBACK.createSafe(memGetAddress(struct + FMOD_OUTPUT_DESCRIPTION.MIXER)); }
    /** Unsafe version of {@link #object3dgetinfo}. */
    @Nullable public static FMOD_OUTPUT_OBJECT3DGETINFO_CALLBACK nobject3dgetinfo(long struct) { return FMOD_OUTPUT_OBJECT3DGETINFO_CALLBACK.createSafe(memGetAddress(struct + FMOD_OUTPUT_DESCRIPTION.OBJECT3DGETINFO)); }
    /** Unsafe version of {@link #object3dalloc}. */
    @Nullable public static FMOD_OUTPUT_OBJECT3DALLOC_CALLBACK nobject3dalloc(long struct) { return FMOD_OUTPUT_OBJECT3DALLOC_CALLBACK.createSafe(memGetAddress(struct + FMOD_OUTPUT_DESCRIPTION.OBJECT3DALLOC)); }
    /** Unsafe version of {@link #object3dfree}. */
    @Nullable public static FMOD_OUTPUT_OBJECT3DFREE_CALLBACK nobject3dfree(long struct) { return FMOD_OUTPUT_OBJECT3DFREE_CALLBACK.createSafe(memGetAddress(struct + FMOD_OUTPUT_DESCRIPTION.OBJECT3DFREE)); }
    /** Unsafe version of {@link #object3dupdate}. */
    @Nullable public static FMOD_OUTPUT_OBJECT3DUPDATE_CALLBACK nobject3dupdate(long struct) { return FMOD_OUTPUT_OBJECT3DUPDATE_CALLBACK.createSafe(memGetAddress(struct + FMOD_OUTPUT_DESCRIPTION.OBJECT3DUPDATE)); }
    /** Unsafe version of {@link #openport}. */
    @Nullable public static FMOD_OUTPUT_OPENPORT_CALLBACK nopenport(long struct) { return FMOD_OUTPUT_OPENPORT_CALLBACK.createSafe(memGetAddress(struct + FMOD_OUTPUT_DESCRIPTION.OPENPORT)); }
    /** Unsafe version of {@link #closeport}. */
    @Nullable public static FMOD_OUTPUT_CLOSEPORT_CALLBACK ncloseport(long struct) { return FMOD_OUTPUT_CLOSEPORT_CALLBACK.createSafe(memGetAddress(struct + FMOD_OUTPUT_DESCRIPTION.CLOSEPORT)); }
    /** Unsafe version of {@link #devicelistchanged}. */
    @Nullable public static FMOD_OUTPUT_DEVICELISTCHANGED_CALLBACK ndevicelistchanged(long struct) { return FMOD_OUTPUT_DEVICELISTCHANGED_CALLBACK.createSafe(memGetAddress(struct + FMOD_OUTPUT_DESCRIPTION.DEVICELISTCHANGED)); }

    /** Unsafe version of {@link #apiversion(int) apiversion}. */
    public static void napiversion(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_OUTPUT_DESCRIPTION.APIVERSION, value); }
    /** Unsafe version of {@link #name(ByteBuffer) name}. */
    public static void nname(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + FMOD_OUTPUT_DESCRIPTION.NAME, memAddress(value));
    }
    /** Unsafe version of {@link #version(int) version}. */
    public static void nversion(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_OUTPUT_DESCRIPTION.VERSION, value); }
    /** Unsafe version of {@link #method(int) method}. */
    public static void nmethod(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_OUTPUT_DESCRIPTION.METHOD, value); }
    /** Unsafe version of {@link #getnumdrivers(FMOD_OUTPUT_GETNUMDRIVERS_CALLBACKI) getnumdrivers}. */
    public static void ngetnumdrivers(long struct, FMOD_OUTPUT_GETNUMDRIVERS_CALLBACKI value) { memPutAddress(struct + FMOD_OUTPUT_DESCRIPTION.GETNUMDRIVERS, value.address()); }
    /** Unsafe version of {@link #getdriverinfo(FMOD_OUTPUT_GETDRIVERINFO_CALLBACKI) getdriverinfo}. */
    public static void ngetdriverinfo(long struct, FMOD_OUTPUT_GETDRIVERINFO_CALLBACKI value) { memPutAddress(struct + FMOD_OUTPUT_DESCRIPTION.GETDRIVERINFO, value.address()); }
    /** Unsafe version of {@link #init(FMOD_OUTPUT_INIT_CALLBACKI) init}. */
    public static void ninit(long struct, FMOD_OUTPUT_INIT_CALLBACKI value) { memPutAddress(struct + FMOD_OUTPUT_DESCRIPTION.INIT, value.address()); }
    /** Unsafe version of {@link #start(FMOD_OUTPUT_START_CALLBACKI) start}. */
    public static void nstart(long struct, @Nullable FMOD_OUTPUT_START_CALLBACKI value) { memPutAddress(struct + FMOD_OUTPUT_DESCRIPTION.START, memAddressSafe(value)); }
    /** Unsafe version of {@link #stop(FMOD_OUTPUT_STOP_CALLBACKI) stop}. */
    public static void nstop(long struct, @Nullable FMOD_OUTPUT_STOP_CALLBACKI value) { memPutAddress(struct + FMOD_OUTPUT_DESCRIPTION.STOP, memAddressSafe(value)); }
    /** Unsafe version of {@link #close$(FMOD_OUTPUT_CLOSE_CALLBACKI) close$}. */
    public static void nclose$(long struct, @Nullable FMOD_OUTPUT_CLOSE_CALLBACKI value) { memPutAddress(struct + FMOD_OUTPUT_DESCRIPTION.CLOSE, memAddressSafe(value)); }
    /** Unsafe version of {@link #update(FMOD_OUTPUT_UPDATE_CALLBACKI) update}. */
    public static void nupdate(long struct, @Nullable FMOD_OUTPUT_UPDATE_CALLBACKI value) { memPutAddress(struct + FMOD_OUTPUT_DESCRIPTION.UPDATE, memAddressSafe(value)); }
    /** Unsafe version of {@link #gethandle(FMOD_OUTPUT_GETHANDLE_CALLBACKI) gethandle}. */
    public static void ngethandle(long struct, @Nullable FMOD_OUTPUT_GETHANDLE_CALLBACKI value) { memPutAddress(struct + FMOD_OUTPUT_DESCRIPTION.GETHANDLE, memAddressSafe(value)); }
    /** Unsafe version of {@link #mixer(FMOD_OUTPUT_MIXER_CALLBACKI) mixer}. */
    public static void nmixer(long struct, @Nullable FMOD_OUTPUT_MIXER_CALLBACKI value) { memPutAddress(struct + FMOD_OUTPUT_DESCRIPTION.MIXER, memAddressSafe(value)); }
    /** Unsafe version of {@link #object3dgetinfo(FMOD_OUTPUT_OBJECT3DGETINFO_CALLBACKI) object3dgetinfo}. */
    public static void nobject3dgetinfo(long struct, @Nullable FMOD_OUTPUT_OBJECT3DGETINFO_CALLBACKI value) { memPutAddress(struct + FMOD_OUTPUT_DESCRIPTION.OBJECT3DGETINFO, memAddressSafe(value)); }
    /** Unsafe version of {@link #object3dalloc(FMOD_OUTPUT_OBJECT3DALLOC_CALLBACKI) object3dalloc}. */
    public static void nobject3dalloc(long struct, @Nullable FMOD_OUTPUT_OBJECT3DALLOC_CALLBACKI value) { memPutAddress(struct + FMOD_OUTPUT_DESCRIPTION.OBJECT3DALLOC, memAddressSafe(value)); }
    /** Unsafe version of {@link #object3dfree(FMOD_OUTPUT_OBJECT3DFREE_CALLBACKI) object3dfree}. */
    public static void nobject3dfree(long struct, @Nullable FMOD_OUTPUT_OBJECT3DFREE_CALLBACKI value) { memPutAddress(struct + FMOD_OUTPUT_DESCRIPTION.OBJECT3DFREE, memAddressSafe(value)); }
    /** Unsafe version of {@link #object3dupdate(FMOD_OUTPUT_OBJECT3DUPDATE_CALLBACKI) object3dupdate}. */
    public static void nobject3dupdate(long struct, @Nullable FMOD_OUTPUT_OBJECT3DUPDATE_CALLBACKI value) { memPutAddress(struct + FMOD_OUTPUT_DESCRIPTION.OBJECT3DUPDATE, memAddressSafe(value)); }
    /** Unsafe version of {@link #openport(FMOD_OUTPUT_OPENPORT_CALLBACKI) openport}. */
    public static void nopenport(long struct, @Nullable FMOD_OUTPUT_OPENPORT_CALLBACKI value) { memPutAddress(struct + FMOD_OUTPUT_DESCRIPTION.OPENPORT, memAddressSafe(value)); }
    /** Unsafe version of {@link #closeport(FMOD_OUTPUT_CLOSEPORT_CALLBACKI) closeport}. */
    public static void ncloseport(long struct, @Nullable FMOD_OUTPUT_CLOSEPORT_CALLBACKI value) { memPutAddress(struct + FMOD_OUTPUT_DESCRIPTION.CLOSEPORT, memAddressSafe(value)); }
    /** Unsafe version of {@link #devicelistchanged(FMOD_OUTPUT_DEVICELISTCHANGED_CALLBACKI) devicelistchanged}. */
    public static void ndevicelistchanged(long struct, @Nullable FMOD_OUTPUT_DEVICELISTCHANGED_CALLBACKI value) { memPutAddress(struct + FMOD_OUTPUT_DESCRIPTION.DEVICELISTCHANGED, memAddressSafe(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + FMOD_OUTPUT_DESCRIPTION.NAME));
        check(memGetAddress(struct + FMOD_OUTPUT_DESCRIPTION.GETNUMDRIVERS));
        check(memGetAddress(struct + FMOD_OUTPUT_DESCRIPTION.GETDRIVERINFO));
        check(memGetAddress(struct + FMOD_OUTPUT_DESCRIPTION.INIT));
    }

    // -----------------------------------

    /** An array of {@link FMOD_OUTPUT_DESCRIPTION} structs. */
    public static class Buffer extends StructBuffer<FMOD_OUTPUT_DESCRIPTION, Buffer> implements NativeResource {

        private static final FMOD_OUTPUT_DESCRIPTION ELEMENT_FACTORY = FMOD_OUTPUT_DESCRIPTION.create(-1L);

        /**
         * Creates a new {@code FMOD_OUTPUT_DESCRIPTION.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_OUTPUT_DESCRIPTION#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_OUTPUT_DESCRIPTION getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code apiversion} field. */
        @NativeType("unsigned int")
        public int apiversion() { return FMOD_OUTPUT_DESCRIPTION.napiversion(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
        @NativeType("char const *")
        public ByteBuffer name() { return FMOD_OUTPUT_DESCRIPTION.nname(address()); }
        /** @return the null-terminated string pointed to by the {@code name} field. */
        @NativeType("char const *")
        public String nameString() { return FMOD_OUTPUT_DESCRIPTION.nnameString(address()); }
        /** @return the value of the {@code version} field. */
        @NativeType("unsigned int")
        public int version() { return FMOD_OUTPUT_DESCRIPTION.nversion(address()); }
        /** @return the value of the {@code method} field. */
        @NativeType("FMOD_OUTPUT_METHOD")
        public int method() { return FMOD_OUTPUT_DESCRIPTION.nmethod(address()); }
        /** @return the value of the {@code getnumdrivers} field. */
        public FMOD_OUTPUT_GETNUMDRIVERS_CALLBACK getnumdrivers() { return FMOD_OUTPUT_DESCRIPTION.ngetnumdrivers(address()); }
        /** @return the value of the {@code getdriverinfo} field. */
        public FMOD_OUTPUT_GETDRIVERINFO_CALLBACK getdriverinfo() { return FMOD_OUTPUT_DESCRIPTION.ngetdriverinfo(address()); }
        /** @return the value of the {@code init} field. */
        public FMOD_OUTPUT_INIT_CALLBACK init() { return FMOD_OUTPUT_DESCRIPTION.ninit(address()); }
        /** @return the value of the {@code start} field. */
        @Nullable
        public FMOD_OUTPUT_START_CALLBACK start() { return FMOD_OUTPUT_DESCRIPTION.nstart(address()); }
        /** @return the value of the {@code stop} field. */
        @Nullable
        public FMOD_OUTPUT_STOP_CALLBACK stop() { return FMOD_OUTPUT_DESCRIPTION.nstop(address()); }
        /** @return the value of the {@code close} field. */
        @Nullable
        public FMOD_OUTPUT_CLOSE_CALLBACK close$() { return FMOD_OUTPUT_DESCRIPTION.nclose$(address()); }
        /** @return the value of the {@code update} field. */
        @Nullable
        public FMOD_OUTPUT_UPDATE_CALLBACK update() { return FMOD_OUTPUT_DESCRIPTION.nupdate(address()); }
        /** @return the value of the {@code gethandle} field. */
        @Nullable
        public FMOD_OUTPUT_GETHANDLE_CALLBACK gethandle() { return FMOD_OUTPUT_DESCRIPTION.ngethandle(address()); }
        /** @return the value of the {@code mixer} field. */
        @Nullable
        public FMOD_OUTPUT_MIXER_CALLBACK mixer() { return FMOD_OUTPUT_DESCRIPTION.nmixer(address()); }
        /** @return the value of the {@code object3dgetinfo} field. */
        @Nullable
        public FMOD_OUTPUT_OBJECT3DGETINFO_CALLBACK object3dgetinfo() { return FMOD_OUTPUT_DESCRIPTION.nobject3dgetinfo(address()); }
        /** @return the value of the {@code object3dalloc} field. */
        @Nullable
        public FMOD_OUTPUT_OBJECT3DALLOC_CALLBACK object3dalloc() { return FMOD_OUTPUT_DESCRIPTION.nobject3dalloc(address()); }
        /** @return the value of the {@code object3dfree} field. */
        @Nullable
        public FMOD_OUTPUT_OBJECT3DFREE_CALLBACK object3dfree() { return FMOD_OUTPUT_DESCRIPTION.nobject3dfree(address()); }
        /** @return the value of the {@code object3dupdate} field. */
        @Nullable
        public FMOD_OUTPUT_OBJECT3DUPDATE_CALLBACK object3dupdate() { return FMOD_OUTPUT_DESCRIPTION.nobject3dupdate(address()); }
        /** @return the value of the {@code openport} field. */
        @Nullable
        public FMOD_OUTPUT_OPENPORT_CALLBACK openport() { return FMOD_OUTPUT_DESCRIPTION.nopenport(address()); }
        /** @return the value of the {@code closeport} field. */
        @Nullable
        public FMOD_OUTPUT_CLOSEPORT_CALLBACK closeport() { return FMOD_OUTPUT_DESCRIPTION.ncloseport(address()); }
        /** @return the value of the {@code devicelistchanged} field. */
        @Nullable
        public FMOD_OUTPUT_DEVICELISTCHANGED_CALLBACK devicelistchanged() { return FMOD_OUTPUT_DESCRIPTION.ndevicelistchanged(address()); }

        /** Sets the specified value to the {@code apiversion} field. */
        public FMOD_OUTPUT_DESCRIPTION.Buffer apiversion(@NativeType("unsigned int") int value) { FMOD_OUTPUT_DESCRIPTION.napiversion(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code name} field. */
        public FMOD_OUTPUT_DESCRIPTION.Buffer name(@NativeType("char const *") ByteBuffer value) { FMOD_OUTPUT_DESCRIPTION.nname(address(), value); return this; }
        /** Sets the specified value to the {@code version} field. */
        public FMOD_OUTPUT_DESCRIPTION.Buffer version(@NativeType("unsigned int") int value) { FMOD_OUTPUT_DESCRIPTION.nversion(address(), value); return this; }
        /** Sets the specified value to the {@code method} field. */
        public FMOD_OUTPUT_DESCRIPTION.Buffer method(@NativeType("FMOD_OUTPUT_METHOD") int value) { FMOD_OUTPUT_DESCRIPTION.nmethod(address(), value); return this; }
        /** Sets the specified value to the {@code getnumdrivers} field. */
        public FMOD_OUTPUT_DESCRIPTION.Buffer getnumdrivers(@NativeType("FMOD_OUTPUT_GETNUMDRIVERS_CALLBACK") FMOD_OUTPUT_GETNUMDRIVERS_CALLBACKI value) { FMOD_OUTPUT_DESCRIPTION.ngetnumdrivers(address(), value); return this; }
        /** Sets the specified value to the {@code getdriverinfo} field. */
        public FMOD_OUTPUT_DESCRIPTION.Buffer getdriverinfo(@NativeType("FMOD_OUTPUT_GETDRIVERINFO_CALLBACK") FMOD_OUTPUT_GETDRIVERINFO_CALLBACKI value) { FMOD_OUTPUT_DESCRIPTION.ngetdriverinfo(address(), value); return this; }
        /** Sets the specified value to the {@code init} field. */
        public FMOD_OUTPUT_DESCRIPTION.Buffer init(@NativeType("FMOD_OUTPUT_INIT_CALLBACK") FMOD_OUTPUT_INIT_CALLBACKI value) { FMOD_OUTPUT_DESCRIPTION.ninit(address(), value); return this; }
        /** Sets the specified value to the {@code start} field. */
        public FMOD_OUTPUT_DESCRIPTION.Buffer start(@Nullable @NativeType("FMOD_OUTPUT_START_CALLBACK") FMOD_OUTPUT_START_CALLBACKI value) { FMOD_OUTPUT_DESCRIPTION.nstart(address(), value); return this; }
        /** Sets the specified value to the {@code stop} field. */
        public FMOD_OUTPUT_DESCRIPTION.Buffer stop(@Nullable @NativeType("FMOD_OUTPUT_STOP_CALLBACK") FMOD_OUTPUT_STOP_CALLBACKI value) { FMOD_OUTPUT_DESCRIPTION.nstop(address(), value); return this; }
        /** Sets the specified value to the {@code close} field. */
        public FMOD_OUTPUT_DESCRIPTION.Buffer close$(@Nullable @NativeType("FMOD_OUTPUT_CLOSE_CALLBACK") FMOD_OUTPUT_CLOSE_CALLBACKI value) { FMOD_OUTPUT_DESCRIPTION.nclose$(address(), value); return this; }
        /** Sets the specified value to the {@code update} field. */
        public FMOD_OUTPUT_DESCRIPTION.Buffer update(@Nullable @NativeType("FMOD_OUTPUT_UPDATE_CALLBACK") FMOD_OUTPUT_UPDATE_CALLBACKI value) { FMOD_OUTPUT_DESCRIPTION.nupdate(address(), value); return this; }
        /** Sets the specified value to the {@code gethandle} field. */
        public FMOD_OUTPUT_DESCRIPTION.Buffer gethandle(@Nullable @NativeType("FMOD_OUTPUT_GETHANDLE_CALLBACK") FMOD_OUTPUT_GETHANDLE_CALLBACKI value) { FMOD_OUTPUT_DESCRIPTION.ngethandle(address(), value); return this; }
        /** Sets the specified value to the {@code mixer} field. */
        public FMOD_OUTPUT_DESCRIPTION.Buffer mixer(@Nullable @NativeType("FMOD_OUTPUT_MIXER_CALLBACK") FMOD_OUTPUT_MIXER_CALLBACKI value) { FMOD_OUTPUT_DESCRIPTION.nmixer(address(), value); return this; }
        /** Sets the specified value to the {@code object3dgetinfo} field. */
        public FMOD_OUTPUT_DESCRIPTION.Buffer object3dgetinfo(@Nullable @NativeType("FMOD_OUTPUT_OBJECT3DGETINFO_CALLBACK") FMOD_OUTPUT_OBJECT3DGETINFO_CALLBACKI value) { FMOD_OUTPUT_DESCRIPTION.nobject3dgetinfo(address(), value); return this; }
        /** Sets the specified value to the {@code object3dalloc} field. */
        public FMOD_OUTPUT_DESCRIPTION.Buffer object3dalloc(@Nullable @NativeType("FMOD_OUTPUT_OBJECT3DALLOC_CALLBACK") FMOD_OUTPUT_OBJECT3DALLOC_CALLBACKI value) { FMOD_OUTPUT_DESCRIPTION.nobject3dalloc(address(), value); return this; }
        /** Sets the specified value to the {@code object3dfree} field. */
        public FMOD_OUTPUT_DESCRIPTION.Buffer object3dfree(@Nullable @NativeType("FMOD_OUTPUT_OBJECT3DFREE_CALLBACK") FMOD_OUTPUT_OBJECT3DFREE_CALLBACKI value) { FMOD_OUTPUT_DESCRIPTION.nobject3dfree(address(), value); return this; }
        /** Sets the specified value to the {@code object3dupdate} field. */
        public FMOD_OUTPUT_DESCRIPTION.Buffer object3dupdate(@Nullable @NativeType("FMOD_OUTPUT_OBJECT3DUPDATE_CALLBACK") FMOD_OUTPUT_OBJECT3DUPDATE_CALLBACKI value) { FMOD_OUTPUT_DESCRIPTION.nobject3dupdate(address(), value); return this; }
        /** Sets the specified value to the {@code openport} field. */
        public FMOD_OUTPUT_DESCRIPTION.Buffer openport(@Nullable @NativeType("FMOD_OUTPUT_OPENPORT_CALLBACK") FMOD_OUTPUT_OPENPORT_CALLBACKI value) { FMOD_OUTPUT_DESCRIPTION.nopenport(address(), value); return this; }
        /** Sets the specified value to the {@code closeport} field. */
        public FMOD_OUTPUT_DESCRIPTION.Buffer closeport(@Nullable @NativeType("FMOD_OUTPUT_CLOSEPORT_CALLBACK") FMOD_OUTPUT_CLOSEPORT_CALLBACKI value) { FMOD_OUTPUT_DESCRIPTION.ncloseport(address(), value); return this; }
        /** Sets the specified value to the {@code devicelistchanged} field. */
        public FMOD_OUTPUT_DESCRIPTION.Buffer devicelistchanged(@Nullable @NativeType("FMOD_OUTPUT_DEVICELISTCHANGED_CALLBACK") FMOD_OUTPUT_DEVICELISTCHANGED_CALLBACKI value) { FMOD_OUTPUT_DESCRIPTION.ndevicelistchanged(address(), value); return this; }

    }

}