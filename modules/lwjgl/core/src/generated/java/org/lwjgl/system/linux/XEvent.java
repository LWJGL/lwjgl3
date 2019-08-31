/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * This union is defined so Xlib can always use the same sized event structure internally, to avoid memory fragmentation.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * union XEvent {
 *     int type;
 *     {@link XAnyEvent XAnyEvent} xany;
 *     {@link XKeyEvent XKeyEvent} xkey;
 *     {@link XButtonEvent XButtonEvent} xbutton;
 *     {@link XMotionEvent XMotionEvent} xmotion;
 *     {@link XCrossingEvent XCrossingEvent} xcrossing;
 *     {@link XFocusChangeEvent XFocusChangeEvent} xfocus;
 *     {@link XExposeEvent XExposeEvent} xexpose;
 *     {@link XGraphicsExposeEvent XGraphicsExposeEvent} xgraphicsexpose;
 *     {@link XNoExposeEvent XNoExposeEvent} xnoexpose;
 *     {@link XVisibilityEvent XVisibilityEvent} xvisibility;
 *     {@link XCreateWindowEvent XCreateWindowEvent} xcreatewindow;
 *     {@link XDestroyWindowEvent XDestroyWindowEvent} xdestroywindow;
 *     {@link XUnmapEvent XUnmapEvent} xunmap;
 *     {@link XMapEvent XMapEvent} xmap;
 *     {@link XMapRequestEvent XMapRequestEvent} xmaprequest;
 *     {@link XReparentEvent XReparentEvent} xreparent;
 *     {@link XConfigureEvent XConfigureEvent} xconfigure;
 *     {@link XGravityEvent XGravityEvent} xgravity;
 *     {@link XResizeRequestEvent XResizeRequestEvent} xresizerequest;
 *     {@link XConfigureRequestEvent XConfigureRequestEvent} xconfigurerequest;
 *     {@link XCirculateEvent XCirculateEvent} xcirculate;
 *     {@link XCirculateRequestEvent XCirculateRequestEvent} xcirculaterequest;
 *     {@link XPropertyEvent XPropertyEvent} xproperty;
 *     {@link XSelectionClearEvent XSelectionClearEvent} xselectionclear;
 *     {@link XSelectionRequestEvent XSelectionRequestEvent} xselectionrequest;
 *     {@link XSelectionEvent XSelectionEvent} xselection;
 *     {@link XColormapEvent XColormapEvent} xcolormap;
 *     {@link XClientMessageEvent XClientMessageEvent} xclient;
 *     {@link XMappingEvent XMappingEvent} xmapping;
 *     {@link XErrorEvent XErrorEvent} xerror;
 *     {@link XKeymapEvent XKeymapEvent} xkeymap;
 *     {@link XGenericEvent XGenericEvent} xgeneric;
 *     {@link XGenericEventCookie XGenericEventCookie} xcookie;
 *     long pad[24];
 * }</code></pre>
 */
public class XEvent extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        XANY,
        XKEY,
        XBUTTON,
        XMOTION,
        XCROSSING,
        XFOCUS,
        XEXPOSE,
        XGRAPHICSEXPOSE,
        XNOEXPOSE,
        XVISIBILITY,
        XCREATEWINDOW,
        XDESTROYWINDOW,
        XUNMAP,
        XMAP,
        XMAPREQUEST,
        XREPARENT,
        XCONFIGURE,
        XGRAVITY,
        XRESIZEREQUEST,
        XCONFIGUREREQUEST,
        XCIRCULATE,
        XCIRCULATEREQUEST,
        XPROPERTY,
        XSELECTIONCLEAR,
        XSELECTIONREQUEST,
        XSELECTION,
        XCOLORMAP,
        XCLIENT,
        XMAPPING,
        XERROR,
        XKEYMAP,
        XGENERIC,
        XCOOKIE,
        PAD;

    static {
        Layout layout = __union(
            __member(4),
            __member(XAnyEvent.SIZEOF, XAnyEvent.ALIGNOF),
            __member(XKeyEvent.SIZEOF, XKeyEvent.ALIGNOF),
            __member(XButtonEvent.SIZEOF, XButtonEvent.ALIGNOF),
            __member(XMotionEvent.SIZEOF, XMotionEvent.ALIGNOF),
            __member(XCrossingEvent.SIZEOF, XCrossingEvent.ALIGNOF),
            __member(XFocusChangeEvent.SIZEOF, XFocusChangeEvent.ALIGNOF),
            __member(XExposeEvent.SIZEOF, XExposeEvent.ALIGNOF),
            __member(XGraphicsExposeEvent.SIZEOF, XGraphicsExposeEvent.ALIGNOF),
            __member(XNoExposeEvent.SIZEOF, XNoExposeEvent.ALIGNOF),
            __member(XVisibilityEvent.SIZEOF, XVisibilityEvent.ALIGNOF),
            __member(XCreateWindowEvent.SIZEOF, XCreateWindowEvent.ALIGNOF),
            __member(XDestroyWindowEvent.SIZEOF, XDestroyWindowEvent.ALIGNOF),
            __member(XUnmapEvent.SIZEOF, XUnmapEvent.ALIGNOF),
            __member(XMapEvent.SIZEOF, XMapEvent.ALIGNOF),
            __member(XMapRequestEvent.SIZEOF, XMapRequestEvent.ALIGNOF),
            __member(XReparentEvent.SIZEOF, XReparentEvent.ALIGNOF),
            __member(XConfigureEvent.SIZEOF, XConfigureEvent.ALIGNOF),
            __member(XGravityEvent.SIZEOF, XGravityEvent.ALIGNOF),
            __member(XResizeRequestEvent.SIZEOF, XResizeRequestEvent.ALIGNOF),
            __member(XConfigureRequestEvent.SIZEOF, XConfigureRequestEvent.ALIGNOF),
            __member(XCirculateEvent.SIZEOF, XCirculateEvent.ALIGNOF),
            __member(XCirculateRequestEvent.SIZEOF, XCirculateRequestEvent.ALIGNOF),
            __member(XPropertyEvent.SIZEOF, XPropertyEvent.ALIGNOF),
            __member(XSelectionClearEvent.SIZEOF, XSelectionClearEvent.ALIGNOF),
            __member(XSelectionRequestEvent.SIZEOF, XSelectionRequestEvent.ALIGNOF),
            __member(XSelectionEvent.SIZEOF, XSelectionEvent.ALIGNOF),
            __member(XColormapEvent.SIZEOF, XColormapEvent.ALIGNOF),
            __member(XClientMessageEvent.SIZEOF, XClientMessageEvent.ALIGNOF),
            __member(XMappingEvent.SIZEOF, XMappingEvent.ALIGNOF),
            __member(XErrorEvent.SIZEOF, XErrorEvent.ALIGNOF),
            __member(XKeymapEvent.SIZEOF, XKeymapEvent.ALIGNOF),
            __member(XGenericEvent.SIZEOF, XGenericEvent.ALIGNOF),
            __member(XGenericEventCookie.SIZEOF, XGenericEventCookie.ALIGNOF),
            __array(CLONG_SIZE, 24)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        XANY = layout.offsetof(1);
        XKEY = layout.offsetof(2);
        XBUTTON = layout.offsetof(3);
        XMOTION = layout.offsetof(4);
        XCROSSING = layout.offsetof(5);
        XFOCUS = layout.offsetof(6);
        XEXPOSE = layout.offsetof(7);
        XGRAPHICSEXPOSE = layout.offsetof(8);
        XNOEXPOSE = layout.offsetof(9);
        XVISIBILITY = layout.offsetof(10);
        XCREATEWINDOW = layout.offsetof(11);
        XDESTROYWINDOW = layout.offsetof(12);
        XUNMAP = layout.offsetof(13);
        XMAP = layout.offsetof(14);
        XMAPREQUEST = layout.offsetof(15);
        XREPARENT = layout.offsetof(16);
        XCONFIGURE = layout.offsetof(17);
        XGRAVITY = layout.offsetof(18);
        XRESIZEREQUEST = layout.offsetof(19);
        XCONFIGUREREQUEST = layout.offsetof(20);
        XCIRCULATE = layout.offsetof(21);
        XCIRCULATEREQUEST = layout.offsetof(22);
        XPROPERTY = layout.offsetof(23);
        XSELECTIONCLEAR = layout.offsetof(24);
        XSELECTIONREQUEST = layout.offsetof(25);
        XSELECTION = layout.offsetof(26);
        XCOLORMAP = layout.offsetof(27);
        XCLIENT = layout.offsetof(28);
        XMAPPING = layout.offsetof(29);
        XERROR = layout.offsetof(30);
        XKEYMAP = layout.offsetof(31);
        XGENERIC = layout.offsetof(32);
        XCOOKIE = layout.offsetof(33);
        PAD = layout.offsetof(34);
    }

    /**
     * Creates a {@code XEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XEvent(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code type} field. */
    public int type() { return ntype(address()); }
    /** Returns a {@link XAnyEvent} view of the {@code xany} field. */
    public XAnyEvent xany() { return nxany(address()); }
    /** Returns a {@link XKeyEvent} view of the {@code xkey} field. */
    public XKeyEvent xkey() { return nxkey(address()); }
    /** Returns a {@link XButtonEvent} view of the {@code xbutton} field. */
    public XButtonEvent xbutton() { return nxbutton(address()); }
    /** Returns a {@link XMotionEvent} view of the {@code xmotion} field. */
    public XMotionEvent xmotion() { return nxmotion(address()); }
    /** Returns a {@link XCrossingEvent} view of the {@code xcrossing} field. */
    public XCrossingEvent xcrossing() { return nxcrossing(address()); }
    /** Returns a {@link XFocusChangeEvent} view of the {@code xfocus} field. */
    public XFocusChangeEvent xfocus() { return nxfocus(address()); }
    /** Returns a {@link XExposeEvent} view of the {@code xexpose} field. */
    public XExposeEvent xexpose() { return nxexpose(address()); }
    /** Returns a {@link XGraphicsExposeEvent} view of the {@code xgraphicsexpose} field. */
    public XGraphicsExposeEvent xgraphicsexpose() { return nxgraphicsexpose(address()); }
    /** Returns a {@link XNoExposeEvent} view of the {@code xnoexpose} field. */
    public XNoExposeEvent xnoexpose() { return nxnoexpose(address()); }
    /** Returns a {@link XVisibilityEvent} view of the {@code xvisibility} field. */
    public XVisibilityEvent xvisibility() { return nxvisibility(address()); }
    /** Returns a {@link XCreateWindowEvent} view of the {@code xcreatewindow} field. */
    public XCreateWindowEvent xcreatewindow() { return nxcreatewindow(address()); }
    /** Returns a {@link XDestroyWindowEvent} view of the {@code xdestroywindow} field. */
    public XDestroyWindowEvent xdestroywindow() { return nxdestroywindow(address()); }
    /** Returns a {@link XUnmapEvent} view of the {@code xunmap} field. */
    public XUnmapEvent xunmap() { return nxunmap(address()); }
    /** Returns a {@link XMapEvent} view of the {@code xmap} field. */
    public XMapEvent xmap() { return nxmap(address()); }
    /** Returns a {@link XMapRequestEvent} view of the {@code xmaprequest} field. */
    public XMapRequestEvent xmaprequest() { return nxmaprequest(address()); }
    /** Returns a {@link XReparentEvent} view of the {@code xreparent} field. */
    public XReparentEvent xreparent() { return nxreparent(address()); }
    /** Returns a {@link XConfigureEvent} view of the {@code xconfigure} field. */
    public XConfigureEvent xconfigure() { return nxconfigure(address()); }
    /** Returns a {@link XGravityEvent} view of the {@code xgravity} field. */
    public XGravityEvent xgravity() { return nxgravity(address()); }
    /** Returns a {@link XResizeRequestEvent} view of the {@code xresizerequest} field. */
    public XResizeRequestEvent xresizerequest() { return nxresizerequest(address()); }
    /** Returns a {@link XConfigureRequestEvent} view of the {@code xconfigurerequest} field. */
    public XConfigureRequestEvent xconfigurerequest() { return nxconfigurerequest(address()); }
    /** Returns a {@link XCirculateEvent} view of the {@code xcirculate} field. */
    public XCirculateEvent xcirculate() { return nxcirculate(address()); }
    /** Returns a {@link XCirculateRequestEvent} view of the {@code xcirculaterequest} field. */
    public XCirculateRequestEvent xcirculaterequest() { return nxcirculaterequest(address()); }
    /** Returns a {@link XPropertyEvent} view of the {@code xproperty} field. */
    public XPropertyEvent xproperty() { return nxproperty(address()); }
    /** Returns a {@link XSelectionClearEvent} view of the {@code xselectionclear} field. */
    public XSelectionClearEvent xselectionclear() { return nxselectionclear(address()); }
    /** Returns a {@link XSelectionRequestEvent} view of the {@code xselectionrequest} field. */
    public XSelectionRequestEvent xselectionrequest() { return nxselectionrequest(address()); }
    /** Returns a {@link XSelectionEvent} view of the {@code xselection} field. */
    public XSelectionEvent xselection() { return nxselection(address()); }
    /** Returns a {@link XColormapEvent} view of the {@code xcolormap} field. */
    public XColormapEvent xcolormap() { return nxcolormap(address()); }
    /** Returns a {@link XClientMessageEvent} view of the {@code xclient} field. */
    public XClientMessageEvent xclient() { return nxclient(address()); }
    /** Returns a {@link XMappingEvent} view of the {@code xmapping} field. */
    public XMappingEvent xmapping() { return nxmapping(address()); }
    /** Returns a {@link XErrorEvent} view of the {@code xerror} field. */
    public XErrorEvent xerror() { return nxerror(address()); }
    /** Returns a {@link XKeymapEvent} view of the {@code xkeymap} field. */
    public XKeymapEvent xkeymap() { return nxkeymap(address()); }
    /** Returns a {@link XGenericEvent} view of the {@code xgeneric} field. */
    public XGenericEvent xgeneric() { return nxgeneric(address()); }
    /** Returns a {@link XGenericEventCookie} view of the {@code xcookie} field. */
    public XGenericEventCookie xcookie() { return nxcookie(address()); }

    // -----------------------------------

    /** Returns a new {@code XEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XEvent malloc() {
        return wrap(XEvent.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XEvent calloc() {
        return wrap(XEvent.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XEvent} instance allocated with {@link BufferUtils}. */
    public static XEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XEvent.class, memAddress(container), container);
    }

    /** Returns a new {@code XEvent} instance for the specified memory address. */
    public static XEvent create(long address) {
        return wrap(XEvent.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XEvent createSafe(long address) {
        return address == NULL ? null : wrap(XEvent.class, address);
    }

    /**
     * Returns a new {@link XEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XEvent.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XEvent.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XEvent.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XEvent.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XEvent} instance allocated on the thread-local {@link MemoryStack}. */
    public static XEvent mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XEvent} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XEvent callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XEvent mallocStack(MemoryStack stack) {
        return wrap(XEvent.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XEvent callocStack(MemoryStack stack) {
        return wrap(XEvent.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XEvent.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XEvent.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XEvent.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XEvent.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XEvent.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XEvent.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XEvent.TYPE); }
    /** Unsafe version of {@link #xany}. */
    public static XAnyEvent nxany(long struct) { return XAnyEvent.create(struct + XEvent.XANY); }
    /** Unsafe version of {@link #xkey}. */
    public static XKeyEvent nxkey(long struct) { return XKeyEvent.create(struct + XEvent.XKEY); }
    /** Unsafe version of {@link #xbutton}. */
    public static XButtonEvent nxbutton(long struct) { return XButtonEvent.create(struct + XEvent.XBUTTON); }
    /** Unsafe version of {@link #xmotion}. */
    public static XMotionEvent nxmotion(long struct) { return XMotionEvent.create(struct + XEvent.XMOTION); }
    /** Unsafe version of {@link #xcrossing}. */
    public static XCrossingEvent nxcrossing(long struct) { return XCrossingEvent.create(struct + XEvent.XCROSSING); }
    /** Unsafe version of {@link #xfocus}. */
    public static XFocusChangeEvent nxfocus(long struct) { return XFocusChangeEvent.create(struct + XEvent.XFOCUS); }
    /** Unsafe version of {@link #xexpose}. */
    public static XExposeEvent nxexpose(long struct) { return XExposeEvent.create(struct + XEvent.XEXPOSE); }
    /** Unsafe version of {@link #xgraphicsexpose}. */
    public static XGraphicsExposeEvent nxgraphicsexpose(long struct) { return XGraphicsExposeEvent.create(struct + XEvent.XGRAPHICSEXPOSE); }
    /** Unsafe version of {@link #xnoexpose}. */
    public static XNoExposeEvent nxnoexpose(long struct) { return XNoExposeEvent.create(struct + XEvent.XNOEXPOSE); }
    /** Unsafe version of {@link #xvisibility}. */
    public static XVisibilityEvent nxvisibility(long struct) { return XVisibilityEvent.create(struct + XEvent.XVISIBILITY); }
    /** Unsafe version of {@link #xcreatewindow}. */
    public static XCreateWindowEvent nxcreatewindow(long struct) { return XCreateWindowEvent.create(struct + XEvent.XCREATEWINDOW); }
    /** Unsafe version of {@link #xdestroywindow}. */
    public static XDestroyWindowEvent nxdestroywindow(long struct) { return XDestroyWindowEvent.create(struct + XEvent.XDESTROYWINDOW); }
    /** Unsafe version of {@link #xunmap}. */
    public static XUnmapEvent nxunmap(long struct) { return XUnmapEvent.create(struct + XEvent.XUNMAP); }
    /** Unsafe version of {@link #xmap}. */
    public static XMapEvent nxmap(long struct) { return XMapEvent.create(struct + XEvent.XMAP); }
    /** Unsafe version of {@link #xmaprequest}. */
    public static XMapRequestEvent nxmaprequest(long struct) { return XMapRequestEvent.create(struct + XEvent.XMAPREQUEST); }
    /** Unsafe version of {@link #xreparent}. */
    public static XReparentEvent nxreparent(long struct) { return XReparentEvent.create(struct + XEvent.XREPARENT); }
    /** Unsafe version of {@link #xconfigure}. */
    public static XConfigureEvent nxconfigure(long struct) { return XConfigureEvent.create(struct + XEvent.XCONFIGURE); }
    /** Unsafe version of {@link #xgravity}. */
    public static XGravityEvent nxgravity(long struct) { return XGravityEvent.create(struct + XEvent.XGRAVITY); }
    /** Unsafe version of {@link #xresizerequest}. */
    public static XResizeRequestEvent nxresizerequest(long struct) { return XResizeRequestEvent.create(struct + XEvent.XRESIZEREQUEST); }
    /** Unsafe version of {@link #xconfigurerequest}. */
    public static XConfigureRequestEvent nxconfigurerequest(long struct) { return XConfigureRequestEvent.create(struct + XEvent.XCONFIGUREREQUEST); }
    /** Unsafe version of {@link #xcirculate}. */
    public static XCirculateEvent nxcirculate(long struct) { return XCirculateEvent.create(struct + XEvent.XCIRCULATE); }
    /** Unsafe version of {@link #xcirculaterequest}. */
    public static XCirculateRequestEvent nxcirculaterequest(long struct) { return XCirculateRequestEvent.create(struct + XEvent.XCIRCULATEREQUEST); }
    /** Unsafe version of {@link #xproperty}. */
    public static XPropertyEvent nxproperty(long struct) { return XPropertyEvent.create(struct + XEvent.XPROPERTY); }
    /** Unsafe version of {@link #xselectionclear}. */
    public static XSelectionClearEvent nxselectionclear(long struct) { return XSelectionClearEvent.create(struct + XEvent.XSELECTIONCLEAR); }
    /** Unsafe version of {@link #xselectionrequest}. */
    public static XSelectionRequestEvent nxselectionrequest(long struct) { return XSelectionRequestEvent.create(struct + XEvent.XSELECTIONREQUEST); }
    /** Unsafe version of {@link #xselection}. */
    public static XSelectionEvent nxselection(long struct) { return XSelectionEvent.create(struct + XEvent.XSELECTION); }
    /** Unsafe version of {@link #xcolormap}. */
    public static XColormapEvent nxcolormap(long struct) { return XColormapEvent.create(struct + XEvent.XCOLORMAP); }
    /** Unsafe version of {@link #xclient}. */
    public static XClientMessageEvent nxclient(long struct) { return XClientMessageEvent.create(struct + XEvent.XCLIENT); }
    /** Unsafe version of {@link #xmapping}. */
    public static XMappingEvent nxmapping(long struct) { return XMappingEvent.create(struct + XEvent.XMAPPING); }
    /** Unsafe version of {@link #xerror}. */
    public static XErrorEvent nxerror(long struct) { return XErrorEvent.create(struct + XEvent.XERROR); }
    /** Unsafe version of {@link #xkeymap}. */
    public static XKeymapEvent nxkeymap(long struct) { return XKeymapEvent.create(struct + XEvent.XKEYMAP); }
    /** Unsafe version of {@link #xgeneric}. */
    public static XGenericEvent nxgeneric(long struct) { return XGenericEvent.create(struct + XEvent.XGENERIC); }
    /** Unsafe version of {@link #xcookie}. */
    public static XGenericEventCookie nxcookie(long struct) { return XGenericEventCookie.create(struct + XEvent.XCOOKIE); }
    public static CLongBuffer npad(long struct) { return memCLongBuffer(struct + XEvent.PAD, 24); }
    public static long npad(long struct, int index) {
        return memGetCLong(struct + XEvent.PAD + check(index, 24) * CLONG_SIZE);
    }

    // -----------------------------------

    /** An array of {@link XEvent} structs. */
    public static class Buffer extends StructBuffer<XEvent, Buffer> implements NativeResource {

        private static final XEvent ELEMENT_FACTORY = XEvent.create(-1L);

        /**
         * Creates a new {@code XEvent.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XEvent#SIZEOF}, and its mark will be undefined.
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
        protected XEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code type} field. */
        public int type() { return XEvent.ntype(address()); }
        /** Returns a {@link XAnyEvent} view of the {@code xany} field. */
        public XAnyEvent xany() { return XEvent.nxany(address()); }
        /** Returns a {@link XKeyEvent} view of the {@code xkey} field. */
        public XKeyEvent xkey() { return XEvent.nxkey(address()); }
        /** Returns a {@link XButtonEvent} view of the {@code xbutton} field. */
        public XButtonEvent xbutton() { return XEvent.nxbutton(address()); }
        /** Returns a {@link XMotionEvent} view of the {@code xmotion} field. */
        public XMotionEvent xmotion() { return XEvent.nxmotion(address()); }
        /** Returns a {@link XCrossingEvent} view of the {@code xcrossing} field. */
        public XCrossingEvent xcrossing() { return XEvent.nxcrossing(address()); }
        /** Returns a {@link XFocusChangeEvent} view of the {@code xfocus} field. */
        public XFocusChangeEvent xfocus() { return XEvent.nxfocus(address()); }
        /** Returns a {@link XExposeEvent} view of the {@code xexpose} field. */
        public XExposeEvent xexpose() { return XEvent.nxexpose(address()); }
        /** Returns a {@link XGraphicsExposeEvent} view of the {@code xgraphicsexpose} field. */
        public XGraphicsExposeEvent xgraphicsexpose() { return XEvent.nxgraphicsexpose(address()); }
        /** Returns a {@link XNoExposeEvent} view of the {@code xnoexpose} field. */
        public XNoExposeEvent xnoexpose() { return XEvent.nxnoexpose(address()); }
        /** Returns a {@link XVisibilityEvent} view of the {@code xvisibility} field. */
        public XVisibilityEvent xvisibility() { return XEvent.nxvisibility(address()); }
        /** Returns a {@link XCreateWindowEvent} view of the {@code xcreatewindow} field. */
        public XCreateWindowEvent xcreatewindow() { return XEvent.nxcreatewindow(address()); }
        /** Returns a {@link XDestroyWindowEvent} view of the {@code xdestroywindow} field. */
        public XDestroyWindowEvent xdestroywindow() { return XEvent.nxdestroywindow(address()); }
        /** Returns a {@link XUnmapEvent} view of the {@code xunmap} field. */
        public XUnmapEvent xunmap() { return XEvent.nxunmap(address()); }
        /** Returns a {@link XMapEvent} view of the {@code xmap} field. */
        public XMapEvent xmap() { return XEvent.nxmap(address()); }
        /** Returns a {@link XMapRequestEvent} view of the {@code xmaprequest} field. */
        public XMapRequestEvent xmaprequest() { return XEvent.nxmaprequest(address()); }
        /** Returns a {@link XReparentEvent} view of the {@code xreparent} field. */
        public XReparentEvent xreparent() { return XEvent.nxreparent(address()); }
        /** Returns a {@link XConfigureEvent} view of the {@code xconfigure} field. */
        public XConfigureEvent xconfigure() { return XEvent.nxconfigure(address()); }
        /** Returns a {@link XGravityEvent} view of the {@code xgravity} field. */
        public XGravityEvent xgravity() { return XEvent.nxgravity(address()); }
        /** Returns a {@link XResizeRequestEvent} view of the {@code xresizerequest} field. */
        public XResizeRequestEvent xresizerequest() { return XEvent.nxresizerequest(address()); }
        /** Returns a {@link XConfigureRequestEvent} view of the {@code xconfigurerequest} field. */
        public XConfigureRequestEvent xconfigurerequest() { return XEvent.nxconfigurerequest(address()); }
        /** Returns a {@link XCirculateEvent} view of the {@code xcirculate} field. */
        public XCirculateEvent xcirculate() { return XEvent.nxcirculate(address()); }
        /** Returns a {@link XCirculateRequestEvent} view of the {@code xcirculaterequest} field. */
        public XCirculateRequestEvent xcirculaterequest() { return XEvent.nxcirculaterequest(address()); }
        /** Returns a {@link XPropertyEvent} view of the {@code xproperty} field. */
        public XPropertyEvent xproperty() { return XEvent.nxproperty(address()); }
        /** Returns a {@link XSelectionClearEvent} view of the {@code xselectionclear} field. */
        public XSelectionClearEvent xselectionclear() { return XEvent.nxselectionclear(address()); }
        /** Returns a {@link XSelectionRequestEvent} view of the {@code xselectionrequest} field. */
        public XSelectionRequestEvent xselectionrequest() { return XEvent.nxselectionrequest(address()); }
        /** Returns a {@link XSelectionEvent} view of the {@code xselection} field. */
        public XSelectionEvent xselection() { return XEvent.nxselection(address()); }
        /** Returns a {@link XColormapEvent} view of the {@code xcolormap} field. */
        public XColormapEvent xcolormap() { return XEvent.nxcolormap(address()); }
        /** Returns a {@link XClientMessageEvent} view of the {@code xclient} field. */
        public XClientMessageEvent xclient() { return XEvent.nxclient(address()); }
        /** Returns a {@link XMappingEvent} view of the {@code xmapping} field. */
        public XMappingEvent xmapping() { return XEvent.nxmapping(address()); }
        /** Returns a {@link XErrorEvent} view of the {@code xerror} field. */
        public XErrorEvent xerror() { return XEvent.nxerror(address()); }
        /** Returns a {@link XKeymapEvent} view of the {@code xkeymap} field. */
        public XKeymapEvent xkeymap() { return XEvent.nxkeymap(address()); }
        /** Returns a {@link XGenericEvent} view of the {@code xgeneric} field. */
        public XGenericEvent xgeneric() { return XEvent.nxgeneric(address()); }
        /** Returns a {@link XGenericEventCookie} view of the {@code xcookie} field. */
        public XGenericEventCookie xcookie() { return XEvent.nxcookie(address()); }

    }

}