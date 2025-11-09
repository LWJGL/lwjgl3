/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.renderdoc;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct RENDERDOC_API_1_6_0 {
 *     void * GetAPIVersion;
 *     void * SetCaptureOptionU32;
 *     void * SetCaptureOptionF32;
 *     void * GetCaptureOptionU32;
 *     void * GetCaptureOptionF32;
 *     void * SetFocusToggleKeys;
 *     void * SetCaptureKeys;
 *     void * GetOverlayBits;
 *     void * MaskOverlayBits;
 *     void * RemoveHooks;
 *     void * UnloadCrashHandler;
 *     void * SetCaptureFilePathTemplate;
 *     void * GetCaptureFilePathTemplate;
 *     void * GetNumCaptures;
 *     void * GetCapture;
 *     void * TriggerCapture;
 *     void * IsTargetControlConnected;
 *     void * LaunchReplayUI;
 *     void * SetActiveWindow;
 *     void * StartFrameCapture;
 *     void * IsFrameCapturing;
 *     void * EndFrameCapture;
 *     void * TriggerMultiFrameCapture;
 *     void * SetCaptureFileComments;
 *     void * DiscardFrameCapture;
 *     void * ShowReplayUI;
 *     void * SetCaptureTitle;
 * }}</pre>
 */
public class RENDERDOC_API_1_6_0 extends Struct<RENDERDOC_API_1_6_0> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        GETAPIVERSION,
        SETCAPTUREOPTIONU32,
        SETCAPTUREOPTIONF32,
        GETCAPTUREOPTIONU32,
        GETCAPTUREOPTIONF32,
        SETFOCUSTOGGLEKEYS,
        SETCAPTUREKEYS,
        GETOVERLAYBITS,
        MASKOVERLAYBITS,
        REMOVEHOOKS,
        UNLOADCRASHHANDLER,
        SETCAPTUREFILEPATHTEMPLATE,
        GETCAPTUREFILEPATHTEMPLATE,
        GETNUMCAPTURES,
        GETCAPTURE,
        TRIGGERCAPTURE,
        ISTARGETCONTROLCONNECTED,
        LAUNCHREPLAYUI,
        SETACTIVEWINDOW,
        STARTFRAMECAPTURE,
        ISFRAMECAPTURING,
        ENDFRAMECAPTURE,
        TRIGGERMULTIFRAMECAPTURE,
        SETCAPTUREFILECOMMENTS,
        DISCARDFRAMECAPTURE,
        SHOWREPLAYUI,
        SETCAPTURETITLE;

    static {
        Layout layout = __struct(
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

        GETAPIVERSION = layout.offsetof(0);
        SETCAPTUREOPTIONU32 = layout.offsetof(1);
        SETCAPTUREOPTIONF32 = layout.offsetof(2);
        GETCAPTUREOPTIONU32 = layout.offsetof(3);
        GETCAPTUREOPTIONF32 = layout.offsetof(4);
        SETFOCUSTOGGLEKEYS = layout.offsetof(5);
        SETCAPTUREKEYS = layout.offsetof(6);
        GETOVERLAYBITS = layout.offsetof(7);
        MASKOVERLAYBITS = layout.offsetof(8);
        REMOVEHOOKS = layout.offsetof(9);
        UNLOADCRASHHANDLER = layout.offsetof(10);
        SETCAPTUREFILEPATHTEMPLATE = layout.offsetof(11);
        GETCAPTUREFILEPATHTEMPLATE = layout.offsetof(12);
        GETNUMCAPTURES = layout.offsetof(13);
        GETCAPTURE = layout.offsetof(14);
        TRIGGERCAPTURE = layout.offsetof(15);
        ISTARGETCONTROLCONNECTED = layout.offsetof(16);
        LAUNCHREPLAYUI = layout.offsetof(17);
        SETACTIVEWINDOW = layout.offsetof(18);
        STARTFRAMECAPTURE = layout.offsetof(19);
        ISFRAMECAPTURING = layout.offsetof(20);
        ENDFRAMECAPTURE = layout.offsetof(21);
        TRIGGERMULTIFRAMECAPTURE = layout.offsetof(22);
        SETCAPTUREFILECOMMENTS = layout.offsetof(23);
        DISCARDFRAMECAPTURE = layout.offsetof(24);
        SHOWREPLAYUI = layout.offsetof(25);
        SETCAPTURETITLE = layout.offsetof(26);
    }

    protected RENDERDOC_API_1_6_0(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected RENDERDOC_API_1_6_0 create(long address, @Nullable ByteBuffer container) {
        return new RENDERDOC_API_1_6_0(address, container);
    }

    /**
     * Creates a {@code RENDERDOC_API_1_6_0} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public RENDERDOC_API_1_6_0(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code GetAPIVersion} field. */
    @NativeType("void *")
    public long GetAPIVersion() { return nGetAPIVersion(address()); }
    /** @return the value of the {@code SetCaptureOptionU32} field. */
    @NativeType("void *")
    public long SetCaptureOptionU32() { return nSetCaptureOptionU32(address()); }
    /** @return the value of the {@code SetCaptureOptionF32} field. */
    @NativeType("void *")
    public long SetCaptureOptionF32() { return nSetCaptureOptionF32(address()); }
    /** @return the value of the {@code GetCaptureOptionU32} field. */
    @NativeType("void *")
    public long GetCaptureOptionU32() { return nGetCaptureOptionU32(address()); }
    /** @return the value of the {@code GetCaptureOptionF32} field. */
    @NativeType("void *")
    public long GetCaptureOptionF32() { return nGetCaptureOptionF32(address()); }
    /** @return the value of the {@code SetFocusToggleKeys} field. */
    @NativeType("void *")
    public long SetFocusToggleKeys() { return nSetFocusToggleKeys(address()); }
    /** @return the value of the {@code SetCaptureKeys} field. */
    @NativeType("void *")
    public long SetCaptureKeys() { return nSetCaptureKeys(address()); }
    /** @return the value of the {@code GetOverlayBits} field. */
    @NativeType("void *")
    public long GetOverlayBits() { return nGetOverlayBits(address()); }
    /** @return the value of the {@code MaskOverlayBits} field. */
    @NativeType("void *")
    public long MaskOverlayBits() { return nMaskOverlayBits(address()); }
    /** @return the value of the {@code RemoveHooks} field. */
    @NativeType("void *")
    public long RemoveHooks() { return nRemoveHooks(address()); }
    /** @return the value of the {@code UnloadCrashHandler} field. */
    @NativeType("void *")
    public long UnloadCrashHandler() { return nUnloadCrashHandler(address()); }
    /** @return the value of the {@code SetCaptureFilePathTemplate} field. */
    @NativeType("void *")
    public long SetCaptureFilePathTemplate() { return nSetCaptureFilePathTemplate(address()); }
    /** @return the value of the {@code GetCaptureFilePathTemplate} field. */
    @NativeType("void *")
    public long GetCaptureFilePathTemplate() { return nGetCaptureFilePathTemplate(address()); }
    /** @return the value of the {@code GetNumCaptures} field. */
    @NativeType("void *")
    public long GetNumCaptures() { return nGetNumCaptures(address()); }
    /** @return the value of the {@code GetCapture} field. */
    @NativeType("void *")
    public long GetCapture() { return nGetCapture(address()); }
    /** @return the value of the {@code TriggerCapture} field. */
    @NativeType("void *")
    public long TriggerCapture() { return nTriggerCapture(address()); }
    /** @return the value of the {@code IsTargetControlConnected} field. */
    @NativeType("void *")
    public long IsTargetControlConnected() { return nIsTargetControlConnected(address()); }
    /** @return the value of the {@code LaunchReplayUI} field. */
    @NativeType("void *")
    public long LaunchReplayUI() { return nLaunchReplayUI(address()); }
    /** @return the value of the {@code SetActiveWindow} field. */
    @NativeType("void *")
    public long SetActiveWindow() { return nSetActiveWindow(address()); }
    /** @return the value of the {@code StartFrameCapture} field. */
    @NativeType("void *")
    public long StartFrameCapture() { return nStartFrameCapture(address()); }
    /** @return the value of the {@code IsFrameCapturing} field. */
    @NativeType("void *")
    public long IsFrameCapturing() { return nIsFrameCapturing(address()); }
    /** @return the value of the {@code EndFrameCapture} field. */
    @NativeType("void *")
    public long EndFrameCapture() { return nEndFrameCapture(address()); }
    /** @return the value of the {@code TriggerMultiFrameCapture} field. */
    @NativeType("void *")
    public long TriggerMultiFrameCapture() { return nTriggerMultiFrameCapture(address()); }
    /** @return the value of the {@code SetCaptureFileComments} field. */
    @NativeType("void *")
    public long SetCaptureFileComments() { return nSetCaptureFileComments(address()); }
    /** @return the value of the {@code DiscardFrameCapture} field. */
    @NativeType("void *")
    public long DiscardFrameCapture() { return nDiscardFrameCapture(address()); }
    /** @return the value of the {@code ShowReplayUI} field. */
    @NativeType("void *")
    public long ShowReplayUI() { return nShowReplayUI(address()); }
    /** @return the value of the {@code SetCaptureTitle} field. */
    @NativeType("void *")
    public long SetCaptureTitle() { return nSetCaptureTitle(address()); }

    // -----------------------------------

    /** Returns a new {@code RENDERDOC_API_1_6_0} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static RENDERDOC_API_1_6_0 malloc() {
        return new RENDERDOC_API_1_6_0(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code RENDERDOC_API_1_6_0} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static RENDERDOC_API_1_6_0 calloc() {
        return new RENDERDOC_API_1_6_0(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code RENDERDOC_API_1_6_0} instance allocated with {@link BufferUtils}. */
    public static RENDERDOC_API_1_6_0 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new RENDERDOC_API_1_6_0(memAddress(container), container);
    }

    /** Returns a new {@code RENDERDOC_API_1_6_0} instance for the specified memory address. */
    public static RENDERDOC_API_1_6_0 create(long address) {
        return new RENDERDOC_API_1_6_0(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable RENDERDOC_API_1_6_0 createSafe(long address) {
        return address == NULL ? null : new RENDERDOC_API_1_6_0(address, null);
    }

    /**
     * Returns a new {@link RENDERDOC_API_1_6_0.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static RENDERDOC_API_1_6_0.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link RENDERDOC_API_1_6_0.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static RENDERDOC_API_1_6_0.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RENDERDOC_API_1_6_0.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static RENDERDOC_API_1_6_0.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link RENDERDOC_API_1_6_0.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static RENDERDOC_API_1_6_0.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static RENDERDOC_API_1_6_0.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code RENDERDOC_API_1_6_0} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static RENDERDOC_API_1_6_0 malloc(MemoryStack stack) {
        return new RENDERDOC_API_1_6_0(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code RENDERDOC_API_1_6_0} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static RENDERDOC_API_1_6_0 calloc(MemoryStack stack) {
        return new RENDERDOC_API_1_6_0(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link RENDERDOC_API_1_6_0.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static RENDERDOC_API_1_6_0.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RENDERDOC_API_1_6_0.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static RENDERDOC_API_1_6_0.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #GetAPIVersion}. */
    public static long nGetAPIVersion(long struct) { return memGetAddress(struct + RENDERDOC_API_1_6_0.GETAPIVERSION); }
    /** Unsafe version of {@link #SetCaptureOptionU32}. */
    public static long nSetCaptureOptionU32(long struct) { return memGetAddress(struct + RENDERDOC_API_1_6_0.SETCAPTUREOPTIONU32); }
    /** Unsafe version of {@link #SetCaptureOptionF32}. */
    public static long nSetCaptureOptionF32(long struct) { return memGetAddress(struct + RENDERDOC_API_1_6_0.SETCAPTUREOPTIONF32); }
    /** Unsafe version of {@link #GetCaptureOptionU32}. */
    public static long nGetCaptureOptionU32(long struct) { return memGetAddress(struct + RENDERDOC_API_1_6_0.GETCAPTUREOPTIONU32); }
    /** Unsafe version of {@link #GetCaptureOptionF32}. */
    public static long nGetCaptureOptionF32(long struct) { return memGetAddress(struct + RENDERDOC_API_1_6_0.GETCAPTUREOPTIONF32); }
    /** Unsafe version of {@link #SetFocusToggleKeys}. */
    public static long nSetFocusToggleKeys(long struct) { return memGetAddress(struct + RENDERDOC_API_1_6_0.SETFOCUSTOGGLEKEYS); }
    /** Unsafe version of {@link #SetCaptureKeys}. */
    public static long nSetCaptureKeys(long struct) { return memGetAddress(struct + RENDERDOC_API_1_6_0.SETCAPTUREKEYS); }
    /** Unsafe version of {@link #GetOverlayBits}. */
    public static long nGetOverlayBits(long struct) { return memGetAddress(struct + RENDERDOC_API_1_6_0.GETOVERLAYBITS); }
    /** Unsafe version of {@link #MaskOverlayBits}. */
    public static long nMaskOverlayBits(long struct) { return memGetAddress(struct + RENDERDOC_API_1_6_0.MASKOVERLAYBITS); }
    /** Unsafe version of {@link #RemoveHooks}. */
    public static long nRemoveHooks(long struct) { return memGetAddress(struct + RENDERDOC_API_1_6_0.REMOVEHOOKS); }
    /** Unsafe version of {@link #UnloadCrashHandler}. */
    public static long nUnloadCrashHandler(long struct) { return memGetAddress(struct + RENDERDOC_API_1_6_0.UNLOADCRASHHANDLER); }
    /** Unsafe version of {@link #SetCaptureFilePathTemplate}. */
    public static long nSetCaptureFilePathTemplate(long struct) { return memGetAddress(struct + RENDERDOC_API_1_6_0.SETCAPTUREFILEPATHTEMPLATE); }
    /** Unsafe version of {@link #GetCaptureFilePathTemplate}. */
    public static long nGetCaptureFilePathTemplate(long struct) { return memGetAddress(struct + RENDERDOC_API_1_6_0.GETCAPTUREFILEPATHTEMPLATE); }
    /** Unsafe version of {@link #GetNumCaptures}. */
    public static long nGetNumCaptures(long struct) { return memGetAddress(struct + RENDERDOC_API_1_6_0.GETNUMCAPTURES); }
    /** Unsafe version of {@link #GetCapture}. */
    public static long nGetCapture(long struct) { return memGetAddress(struct + RENDERDOC_API_1_6_0.GETCAPTURE); }
    /** Unsafe version of {@link #TriggerCapture}. */
    public static long nTriggerCapture(long struct) { return memGetAddress(struct + RENDERDOC_API_1_6_0.TRIGGERCAPTURE); }
    /** Unsafe version of {@link #IsTargetControlConnected}. */
    public static long nIsTargetControlConnected(long struct) { return memGetAddress(struct + RENDERDOC_API_1_6_0.ISTARGETCONTROLCONNECTED); }
    /** Unsafe version of {@link #LaunchReplayUI}. */
    public static long nLaunchReplayUI(long struct) { return memGetAddress(struct + RENDERDOC_API_1_6_0.LAUNCHREPLAYUI); }
    /** Unsafe version of {@link #SetActiveWindow}. */
    public static long nSetActiveWindow(long struct) { return memGetAddress(struct + RENDERDOC_API_1_6_0.SETACTIVEWINDOW); }
    /** Unsafe version of {@link #StartFrameCapture}. */
    public static long nStartFrameCapture(long struct) { return memGetAddress(struct + RENDERDOC_API_1_6_0.STARTFRAMECAPTURE); }
    /** Unsafe version of {@link #IsFrameCapturing}. */
    public static long nIsFrameCapturing(long struct) { return memGetAddress(struct + RENDERDOC_API_1_6_0.ISFRAMECAPTURING); }
    /** Unsafe version of {@link #EndFrameCapture}. */
    public static long nEndFrameCapture(long struct) { return memGetAddress(struct + RENDERDOC_API_1_6_0.ENDFRAMECAPTURE); }
    /** Unsafe version of {@link #TriggerMultiFrameCapture}. */
    public static long nTriggerMultiFrameCapture(long struct) { return memGetAddress(struct + RENDERDOC_API_1_6_0.TRIGGERMULTIFRAMECAPTURE); }
    /** Unsafe version of {@link #SetCaptureFileComments}. */
    public static long nSetCaptureFileComments(long struct) { return memGetAddress(struct + RENDERDOC_API_1_6_0.SETCAPTUREFILECOMMENTS); }
    /** Unsafe version of {@link #DiscardFrameCapture}. */
    public static long nDiscardFrameCapture(long struct) { return memGetAddress(struct + RENDERDOC_API_1_6_0.DISCARDFRAMECAPTURE); }
    /** Unsafe version of {@link #ShowReplayUI}. */
    public static long nShowReplayUI(long struct) { return memGetAddress(struct + RENDERDOC_API_1_6_0.SHOWREPLAYUI); }
    /** Unsafe version of {@link #SetCaptureTitle}. */
    public static long nSetCaptureTitle(long struct) { return memGetAddress(struct + RENDERDOC_API_1_6_0.SETCAPTURETITLE); }

    // -----------------------------------

    /** An array of {@link RENDERDOC_API_1_6_0} structs. */
    public static class Buffer extends StructBuffer<RENDERDOC_API_1_6_0, Buffer> implements NativeResource {

        private static final RENDERDOC_API_1_6_0 ELEMENT_FACTORY = RENDERDOC_API_1_6_0.create(-1L);

        /**
         * Creates a new {@code RENDERDOC_API_1_6_0.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link RENDERDOC_API_1_6_0#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected RENDERDOC_API_1_6_0 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code GetAPIVersion} field. */
        @NativeType("void *")
        public long GetAPIVersion() { return RENDERDOC_API_1_6_0.nGetAPIVersion(address()); }
        /** @return the value of the {@code SetCaptureOptionU32} field. */
        @NativeType("void *")
        public long SetCaptureOptionU32() { return RENDERDOC_API_1_6_0.nSetCaptureOptionU32(address()); }
        /** @return the value of the {@code SetCaptureOptionF32} field. */
        @NativeType("void *")
        public long SetCaptureOptionF32() { return RENDERDOC_API_1_6_0.nSetCaptureOptionF32(address()); }
        /** @return the value of the {@code GetCaptureOptionU32} field. */
        @NativeType("void *")
        public long GetCaptureOptionU32() { return RENDERDOC_API_1_6_0.nGetCaptureOptionU32(address()); }
        /** @return the value of the {@code GetCaptureOptionF32} field. */
        @NativeType("void *")
        public long GetCaptureOptionF32() { return RENDERDOC_API_1_6_0.nGetCaptureOptionF32(address()); }
        /** @return the value of the {@code SetFocusToggleKeys} field. */
        @NativeType("void *")
        public long SetFocusToggleKeys() { return RENDERDOC_API_1_6_0.nSetFocusToggleKeys(address()); }
        /** @return the value of the {@code SetCaptureKeys} field. */
        @NativeType("void *")
        public long SetCaptureKeys() { return RENDERDOC_API_1_6_0.nSetCaptureKeys(address()); }
        /** @return the value of the {@code GetOverlayBits} field. */
        @NativeType("void *")
        public long GetOverlayBits() { return RENDERDOC_API_1_6_0.nGetOverlayBits(address()); }
        /** @return the value of the {@code MaskOverlayBits} field. */
        @NativeType("void *")
        public long MaskOverlayBits() { return RENDERDOC_API_1_6_0.nMaskOverlayBits(address()); }
        /** @return the value of the {@code RemoveHooks} field. */
        @NativeType("void *")
        public long RemoveHooks() { return RENDERDOC_API_1_6_0.nRemoveHooks(address()); }
        /** @return the value of the {@code UnloadCrashHandler} field. */
        @NativeType("void *")
        public long UnloadCrashHandler() { return RENDERDOC_API_1_6_0.nUnloadCrashHandler(address()); }
        /** @return the value of the {@code SetCaptureFilePathTemplate} field. */
        @NativeType("void *")
        public long SetCaptureFilePathTemplate() { return RENDERDOC_API_1_6_0.nSetCaptureFilePathTemplate(address()); }
        /** @return the value of the {@code GetCaptureFilePathTemplate} field. */
        @NativeType("void *")
        public long GetCaptureFilePathTemplate() { return RENDERDOC_API_1_6_0.nGetCaptureFilePathTemplate(address()); }
        /** @return the value of the {@code GetNumCaptures} field. */
        @NativeType("void *")
        public long GetNumCaptures() { return RENDERDOC_API_1_6_0.nGetNumCaptures(address()); }
        /** @return the value of the {@code GetCapture} field. */
        @NativeType("void *")
        public long GetCapture() { return RENDERDOC_API_1_6_0.nGetCapture(address()); }
        /** @return the value of the {@code TriggerCapture} field. */
        @NativeType("void *")
        public long TriggerCapture() { return RENDERDOC_API_1_6_0.nTriggerCapture(address()); }
        /** @return the value of the {@code IsTargetControlConnected} field. */
        @NativeType("void *")
        public long IsTargetControlConnected() { return RENDERDOC_API_1_6_0.nIsTargetControlConnected(address()); }
        /** @return the value of the {@code LaunchReplayUI} field. */
        @NativeType("void *")
        public long LaunchReplayUI() { return RENDERDOC_API_1_6_0.nLaunchReplayUI(address()); }
        /** @return the value of the {@code SetActiveWindow} field. */
        @NativeType("void *")
        public long SetActiveWindow() { return RENDERDOC_API_1_6_0.nSetActiveWindow(address()); }
        /** @return the value of the {@code StartFrameCapture} field. */
        @NativeType("void *")
        public long StartFrameCapture() { return RENDERDOC_API_1_6_0.nStartFrameCapture(address()); }
        /** @return the value of the {@code IsFrameCapturing} field. */
        @NativeType("void *")
        public long IsFrameCapturing() { return RENDERDOC_API_1_6_0.nIsFrameCapturing(address()); }
        /** @return the value of the {@code EndFrameCapture} field. */
        @NativeType("void *")
        public long EndFrameCapture() { return RENDERDOC_API_1_6_0.nEndFrameCapture(address()); }
        /** @return the value of the {@code TriggerMultiFrameCapture} field. */
        @NativeType("void *")
        public long TriggerMultiFrameCapture() { return RENDERDOC_API_1_6_0.nTriggerMultiFrameCapture(address()); }
        /** @return the value of the {@code SetCaptureFileComments} field. */
        @NativeType("void *")
        public long SetCaptureFileComments() { return RENDERDOC_API_1_6_0.nSetCaptureFileComments(address()); }
        /** @return the value of the {@code DiscardFrameCapture} field. */
        @NativeType("void *")
        public long DiscardFrameCapture() { return RENDERDOC_API_1_6_0.nDiscardFrameCapture(address()); }
        /** @return the value of the {@code ShowReplayUI} field. */
        @NativeType("void *")
        public long ShowReplayUI() { return RENDERDOC_API_1_6_0.nShowReplayUI(address()); }
        /** @return the value of the {@code SetCaptureTitle} field. */
        @NativeType("void *")
        public long SetCaptureTitle() { return RENDERDOC_API_1_6_0.nSetCaptureTitle(address()); }

    }

}