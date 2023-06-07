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
 * struct FMOD_CREATESOUNDEXINFO {
 *     int cbsize;
 *     unsigned int length;
 *     unsigned int fileoffset;
 *     int numchannels;
 *     int defaultfrequency;
 *     FMOD_SOUND_FORMAT format;
 *     unsigned int decodebuffersize;
 *     int initialsubsound;
 *     int numsubsounds;
 *     int * inclusionlist;
 *     int inclusionlistnum;
 *     {@link FMOD_SOUND_PCMREAD_CALLBACKI FMOD_SOUND_PCMREAD_CALLBACK} pcmreadcallback;
 *     {@link FMOD_SOUND_PCMSETPOS_CALLBACKI FMOD_SOUND_PCMSETPOS_CALLBACK} pcmsetposcallback;
 *     {@link FMOD_SOUND_NONBLOCK_CALLBACKI FMOD_SOUND_NONBLOCK_CALLBACK} nonblockcallback;
 *     char const * dlsname;
 *     char const * encryptionkey;
 *     int maxpolyphony;
 *     void * userdata;
 *     FMOD_SOUND_TYPE suggestedsoundtype;
 *     {@link FMOD_FILE_OPEN_CALLBACKI FMOD_FILE_OPEN_CALLBACK} fileuseropen;
 *     {@link FMOD_FILE_CLOSE_CALLBACKI FMOD_FILE_CLOSE_CALLBACK} fileuserclose;
 *     {@link FMOD_FILE_READ_CALLBACKI FMOD_FILE_READ_CALLBACK} fileuserread;
 *     {@link FMOD_FILE_SEEK_CALLBACKI FMOD_FILE_SEEK_CALLBACK} fileuserseek;
 *     {@link FMOD_FILE_ASYNCREAD_CALLBACKI FMOD_FILE_ASYNCREAD_CALLBACK} fileuserasyncread;
 *     {@link FMOD_FILE_ASYNCCANCEL_CALLBACKI FMOD_FILE_ASYNCCANCEL_CALLBACK} fileuserasynccancel;
 *     void * fileuserdata;
 *     int filebuffersize;
 *     FMOD_CHANNELORDER channelorder;
 *     FMOD_SOUNDGROUP * initialsoundgroup;
 *     unsigned int initialseekposition;
 *     FMOD_TIMEUNIT initialseekpostype;
 *     int ignoresetfilesystem;
 *     unsigned int audioqueuepolicy;
 *     unsigned int minmidigranularity;
 *     int nonblockthreadid;
 *     {@link FMOD_GUID FMOD_GUID} * fsbguid;
 * }</code></pre>
 */
public class FMOD_CREATESOUNDEXINFO extends Struct<FMOD_CREATESOUNDEXINFO> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CBSIZE,
        LENGTH,
        FILEOFFSET,
        NUMCHANNELS,
        DEFAULTFREQUENCY,
        FORMAT,
        DECODEBUFFERSIZE,
        INITIALSUBSOUND,
        NUMSUBSOUNDS,
        INCLUSIONLIST,
        INCLUSIONLISTNUM,
        PCMREADCALLBACK,
        PCMSETPOSCALLBACK,
        NONBLOCKCALLBACK,
        DLSNAME,
        ENCRYPTIONKEY,
        MAXPOLYPHONY,
        USERDATA,
        SUGGESTEDSOUNDTYPE,
        FILEUSEROPEN,
        FILEUSERCLOSE,
        FILEUSERREAD,
        FILEUSERSEEK,
        FILEUSERASYNCREAD,
        FILEUSERASYNCCANCEL,
        FILEUSERDATA,
        FILEBUFFERSIZE,
        CHANNELORDER,
        INITIALSOUNDGROUP,
        INITIALSEEKPOSITION,
        INITIALSEEKPOSTYPE,
        IGNORESETFILESYSTEM,
        AUDIOQUEUEPOLICY,
        MINMIDIGRANULARITY,
        NONBLOCKTHREADID,
        FSBGUID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CBSIZE = layout.offsetof(0);
        LENGTH = layout.offsetof(1);
        FILEOFFSET = layout.offsetof(2);
        NUMCHANNELS = layout.offsetof(3);
        DEFAULTFREQUENCY = layout.offsetof(4);
        FORMAT = layout.offsetof(5);
        DECODEBUFFERSIZE = layout.offsetof(6);
        INITIALSUBSOUND = layout.offsetof(7);
        NUMSUBSOUNDS = layout.offsetof(8);
        INCLUSIONLIST = layout.offsetof(9);
        INCLUSIONLISTNUM = layout.offsetof(10);
        PCMREADCALLBACK = layout.offsetof(11);
        PCMSETPOSCALLBACK = layout.offsetof(12);
        NONBLOCKCALLBACK = layout.offsetof(13);
        DLSNAME = layout.offsetof(14);
        ENCRYPTIONKEY = layout.offsetof(15);
        MAXPOLYPHONY = layout.offsetof(16);
        USERDATA = layout.offsetof(17);
        SUGGESTEDSOUNDTYPE = layout.offsetof(18);
        FILEUSEROPEN = layout.offsetof(19);
        FILEUSERCLOSE = layout.offsetof(20);
        FILEUSERREAD = layout.offsetof(21);
        FILEUSERSEEK = layout.offsetof(22);
        FILEUSERASYNCREAD = layout.offsetof(23);
        FILEUSERASYNCCANCEL = layout.offsetof(24);
        FILEUSERDATA = layout.offsetof(25);
        FILEBUFFERSIZE = layout.offsetof(26);
        CHANNELORDER = layout.offsetof(27);
        INITIALSOUNDGROUP = layout.offsetof(28);
        INITIALSEEKPOSITION = layout.offsetof(29);
        INITIALSEEKPOSTYPE = layout.offsetof(30);
        IGNORESETFILESYSTEM = layout.offsetof(31);
        AUDIOQUEUEPOLICY = layout.offsetof(32);
        MINMIDIGRANULARITY = layout.offsetof(33);
        NONBLOCKTHREADID = layout.offsetof(34);
        FSBGUID = layout.offsetof(35);
    }

    protected FMOD_CREATESOUNDEXINFO(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_CREATESOUNDEXINFO create(long address, @Nullable ByteBuffer container) {
        return new FMOD_CREATESOUNDEXINFO(address, container);
    }

    /**
     * Creates a {@code FMOD_CREATESOUNDEXINFO} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_CREATESOUNDEXINFO(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code cbsize} field. */
    public int cbsize() { return ncbsize(address()); }
    /** @return the value of the {@code length} field. */
    @NativeType("unsigned int")
    public int length() { return nlength(address()); }
    /** @return the value of the {@code fileoffset} field. */
    @NativeType("unsigned int")
    public int fileoffset() { return nfileoffset(address()); }
    /** @return the value of the {@code numchannels} field. */
    public int numchannels() { return nnumchannels(address()); }
    /** @return the value of the {@code defaultfrequency} field. */
    public int defaultfrequency() { return ndefaultfrequency(address()); }
    /** @return the value of the {@code format} field. */
    @NativeType("FMOD_SOUND_FORMAT")
    public int format() { return nformat(address()); }
    /** @return the value of the {@code decodebuffersize} field. */
    @NativeType("unsigned int")
    public int decodebuffersize() { return ndecodebuffersize(address()); }
    /** @return the value of the {@code initialsubsound} field. */
    public int initialsubsound() { return ninitialsubsound(address()); }
    /** @return the value of the {@code numsubsounds} field. */
    public int numsubsounds() { return nnumsubsounds(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code inclusionlist} field. */
    @NativeType("int *")
    public IntBuffer inclusionlist() { return ninclusionlist(address()); }
    /** @return the value of the {@code inclusionlistnum} field. */
    public int inclusionlistnum() { return ninclusionlistnum(address()); }
    /** @return the value of the {@code pcmreadcallback} field. */
    @Nullable
    public FMOD_SOUND_PCMREAD_CALLBACK pcmreadcallback() { return npcmreadcallback(address()); }
    /** @return the value of the {@code pcmsetposcallback} field. */
    @Nullable
    public FMOD_SOUND_PCMSETPOS_CALLBACK pcmsetposcallback() { return npcmsetposcallback(address()); }
    /** @return the value of the {@code nonblockcallback} field. */
    @Nullable
    public FMOD_SOUND_NONBLOCK_CALLBACK nonblockcallback() { return nnonblockcallback(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code dlsname} field. */
    @Nullable
    @NativeType("char const *")
    public ByteBuffer dlsname() { return ndlsname(address()); }
    /** @return the null-terminated string pointed to by the {@code dlsname} field. */
    @Nullable
    @NativeType("char const *")
    public String dlsnameString() { return ndlsnameString(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code encryptionkey} field. */
    @Nullable
    @NativeType("char const *")
    public ByteBuffer encryptionkey() { return nencryptionkey(address()); }
    /** @return the null-terminated string pointed to by the {@code encryptionkey} field. */
    @Nullable
    @NativeType("char const *")
    public String encryptionkeyString() { return nencryptionkeyString(address()); }
    /** @return the value of the {@code maxpolyphony} field. */
    public int maxpolyphony() { return nmaxpolyphony(address()); }
    /** @return the value of the {@code userdata} field. */
    @NativeType("void *")
    public long userdata() { return nuserdata(address()); }
    /** @return the value of the {@code suggestedsoundtype} field. */
    @NativeType("FMOD_SOUND_TYPE")
    public int suggestedsoundtype() { return nsuggestedsoundtype(address()); }
    /** @return the value of the {@code fileuseropen} field. */
    @Nullable
    public FMOD_FILE_OPEN_CALLBACK fileuseropen() { return nfileuseropen(address()); }
    /** @return the value of the {@code fileuserclose} field. */
    @Nullable
    public FMOD_FILE_CLOSE_CALLBACK fileuserclose() { return nfileuserclose(address()); }
    /** @return the value of the {@code fileuserread} field. */
    @Nullable
    public FMOD_FILE_READ_CALLBACK fileuserread() { return nfileuserread(address()); }
    /** @return the value of the {@code fileuserseek} field. */
    @Nullable
    public FMOD_FILE_SEEK_CALLBACK fileuserseek() { return nfileuserseek(address()); }
    /** @return the value of the {@code fileuserasyncread} field. */
    @Nullable
    public FMOD_FILE_ASYNCREAD_CALLBACK fileuserasyncread() { return nfileuserasyncread(address()); }
    /** @return the value of the {@code fileuserasynccancel} field. */
    @Nullable
    public FMOD_FILE_ASYNCCANCEL_CALLBACK fileuserasynccancel() { return nfileuserasynccancel(address()); }
    /** @return the value of the {@code fileuserdata} field. */
    @NativeType("void *")
    public long fileuserdata() { return nfileuserdata(address()); }
    /** @return the value of the {@code filebuffersize} field. */
    public int filebuffersize() { return nfilebuffersize(address()); }
    /** @return the value of the {@code channelorder} field. */
    @NativeType("FMOD_CHANNELORDER")
    public int channelorder() { return nchannelorder(address()); }
    /** @return the value of the {@code initialsoundgroup} field. */
    @NativeType("FMOD_SOUNDGROUP *")
    public long initialsoundgroup() { return ninitialsoundgroup(address()); }
    /** @return the value of the {@code initialseekposition} field. */
    @NativeType("unsigned int")
    public int initialseekposition() { return ninitialseekposition(address()); }
    /** @return the value of the {@code initialseekpostype} field. */
    @NativeType("FMOD_TIMEUNIT")
    public int initialseekpostype() { return ninitialseekpostype(address()); }
    /** @return the value of the {@code ignoresetfilesystem} field. */
    public int ignoresetfilesystem() { return nignoresetfilesystem(address()); }
    /** @return the value of the {@code audioqueuepolicy} field. */
    @NativeType("unsigned int")
    public int audioqueuepolicy() { return naudioqueuepolicy(address()); }
    /** @return the value of the {@code minmidigranularity} field. */
    @NativeType("unsigned int")
    public int minmidigranularity() { return nminmidigranularity(address()); }
    /** @return the value of the {@code nonblockthreadid} field. */
    public int nonblockthreadid() { return nnonblockthreadid(address()); }
    /** @return a {@link FMOD_GUID} view of the struct pointed to by the {@code fsbguid} field. */
    @Nullable
    @NativeType("FMOD_GUID *")
    public FMOD_GUID fsbguid() { return nfsbguid(address()); }

    /** Sets the specified value to the {@code cbsize} field. */
    public FMOD_CREATESOUNDEXINFO cbsize(int value) { ncbsize(address(), value); return this; }
    /** Sets the specified value to the {@code length} field. */
    public FMOD_CREATESOUNDEXINFO length(@NativeType("unsigned int") int value) { nlength(address(), value); return this; }
    /** Sets the specified value to the {@code fileoffset} field. */
    public FMOD_CREATESOUNDEXINFO fileoffset(@NativeType("unsigned int") int value) { nfileoffset(address(), value); return this; }
    /** Sets the specified value to the {@code numchannels} field. */
    public FMOD_CREATESOUNDEXINFO numchannels(int value) { nnumchannels(address(), value); return this; }
    /** Sets the specified value to the {@code defaultfrequency} field. */
    public FMOD_CREATESOUNDEXINFO defaultfrequency(int value) { ndefaultfrequency(address(), value); return this; }
    /** Sets the specified value to the {@code format} field. */
    public FMOD_CREATESOUNDEXINFO format(@NativeType("FMOD_SOUND_FORMAT") int value) { nformat(address(), value); return this; }
    /** Sets the specified value to the {@code decodebuffersize} field. */
    public FMOD_CREATESOUNDEXINFO decodebuffersize(@NativeType("unsigned int") int value) { ndecodebuffersize(address(), value); return this; }
    /** Sets the specified value to the {@code initialsubsound} field. */
    public FMOD_CREATESOUNDEXINFO initialsubsound(int value) { ninitialsubsound(address(), value); return this; }
    /** Sets the specified value to the {@code numsubsounds} field. */
    public FMOD_CREATESOUNDEXINFO numsubsounds(int value) { nnumsubsounds(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code inclusionlist} field. */
    public FMOD_CREATESOUNDEXINFO inclusionlist(@NativeType("int *") IntBuffer value) { ninclusionlist(address(), value); return this; }
    /** Sets the specified value to the {@code pcmreadcallback} field. */
    public FMOD_CREATESOUNDEXINFO pcmreadcallback(@Nullable @NativeType("FMOD_SOUND_PCMREAD_CALLBACK") FMOD_SOUND_PCMREAD_CALLBACKI value) { npcmreadcallback(address(), value); return this; }
    /** Sets the specified value to the {@code pcmsetposcallback} field. */
    public FMOD_CREATESOUNDEXINFO pcmsetposcallback(@Nullable @NativeType("FMOD_SOUND_PCMSETPOS_CALLBACK") FMOD_SOUND_PCMSETPOS_CALLBACKI value) { npcmsetposcallback(address(), value); return this; }
    /** Sets the specified value to the {@code nonblockcallback} field. */
    public FMOD_CREATESOUNDEXINFO nonblockcallback(@Nullable @NativeType("FMOD_SOUND_NONBLOCK_CALLBACK") FMOD_SOUND_NONBLOCK_CALLBACKI value) { nnonblockcallback(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code dlsname} field. */
    public FMOD_CREATESOUNDEXINFO dlsname(@Nullable @NativeType("char const *") ByteBuffer value) { ndlsname(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code encryptionkey} field. */
    public FMOD_CREATESOUNDEXINFO encryptionkey(@Nullable @NativeType("char const *") ByteBuffer value) { nencryptionkey(address(), value); return this; }
    /** Sets the specified value to the {@code maxpolyphony} field. */
    public FMOD_CREATESOUNDEXINFO maxpolyphony(int value) { nmaxpolyphony(address(), value); return this; }
    /** Sets the specified value to the {@code userdata} field. */
    public FMOD_CREATESOUNDEXINFO userdata(@NativeType("void *") long value) { nuserdata(address(), value); return this; }
    /** Sets the specified value to the {@code suggestedsoundtype} field. */
    public FMOD_CREATESOUNDEXINFO suggestedsoundtype(@NativeType("FMOD_SOUND_TYPE") int value) { nsuggestedsoundtype(address(), value); return this; }
    /** Sets the specified value to the {@code fileuseropen} field. */
    public FMOD_CREATESOUNDEXINFO fileuseropen(@Nullable @NativeType("FMOD_FILE_OPEN_CALLBACK") FMOD_FILE_OPEN_CALLBACKI value) { nfileuseropen(address(), value); return this; }
    /** Sets the specified value to the {@code fileuserclose} field. */
    public FMOD_CREATESOUNDEXINFO fileuserclose(@Nullable @NativeType("FMOD_FILE_CLOSE_CALLBACK") FMOD_FILE_CLOSE_CALLBACKI value) { nfileuserclose(address(), value); return this; }
    /** Sets the specified value to the {@code fileuserread} field. */
    public FMOD_CREATESOUNDEXINFO fileuserread(@Nullable @NativeType("FMOD_FILE_READ_CALLBACK") FMOD_FILE_READ_CALLBACKI value) { nfileuserread(address(), value); return this; }
    /** Sets the specified value to the {@code fileuserseek} field. */
    public FMOD_CREATESOUNDEXINFO fileuserseek(@Nullable @NativeType("FMOD_FILE_SEEK_CALLBACK") FMOD_FILE_SEEK_CALLBACKI value) { nfileuserseek(address(), value); return this; }
    /** Sets the specified value to the {@code fileuserasyncread} field. */
    public FMOD_CREATESOUNDEXINFO fileuserasyncread(@Nullable @NativeType("FMOD_FILE_ASYNCREAD_CALLBACK") FMOD_FILE_ASYNCREAD_CALLBACKI value) { nfileuserasyncread(address(), value); return this; }
    /** Sets the specified value to the {@code fileuserasynccancel} field. */
    public FMOD_CREATESOUNDEXINFO fileuserasynccancel(@Nullable @NativeType("FMOD_FILE_ASYNCCANCEL_CALLBACK") FMOD_FILE_ASYNCCANCEL_CALLBACKI value) { nfileuserasynccancel(address(), value); return this; }
    /** Sets the specified value to the {@code fileuserdata} field. */
    public FMOD_CREATESOUNDEXINFO fileuserdata(@NativeType("void *") long value) { nfileuserdata(address(), value); return this; }
    /** Sets the specified value to the {@code filebuffersize} field. */
    public FMOD_CREATESOUNDEXINFO filebuffersize(int value) { nfilebuffersize(address(), value); return this; }
    /** Sets the specified value to the {@code channelorder} field. */
    public FMOD_CREATESOUNDEXINFO channelorder(@NativeType("FMOD_CHANNELORDER") int value) { nchannelorder(address(), value); return this; }
    /** Sets the specified value to the {@code initialsoundgroup} field. */
    public FMOD_CREATESOUNDEXINFO initialsoundgroup(@NativeType("FMOD_SOUNDGROUP *") long value) { ninitialsoundgroup(address(), value); return this; }
    /** Sets the specified value to the {@code initialseekposition} field. */
    public FMOD_CREATESOUNDEXINFO initialseekposition(@NativeType("unsigned int") int value) { ninitialseekposition(address(), value); return this; }
    /** Sets the specified value to the {@code initialseekpostype} field. */
    public FMOD_CREATESOUNDEXINFO initialseekpostype(@NativeType("FMOD_TIMEUNIT") int value) { ninitialseekpostype(address(), value); return this; }
    /** Sets the specified value to the {@code ignoresetfilesystem} field. */
    public FMOD_CREATESOUNDEXINFO ignoresetfilesystem(int value) { nignoresetfilesystem(address(), value); return this; }
    /** Sets the specified value to the {@code audioqueuepolicy} field. */
    public FMOD_CREATESOUNDEXINFO audioqueuepolicy(@NativeType("unsigned int") int value) { naudioqueuepolicy(address(), value); return this; }
    /** Sets the specified value to the {@code minmidigranularity} field. */
    public FMOD_CREATESOUNDEXINFO minmidigranularity(@NativeType("unsigned int") int value) { nminmidigranularity(address(), value); return this; }
    /** Sets the specified value to the {@code nonblockthreadid} field. */
    public FMOD_CREATESOUNDEXINFO nonblockthreadid(int value) { nnonblockthreadid(address(), value); return this; }
    /** Sets the address of the specified {@link FMOD_GUID} to the {@code fsbguid} field. */
    public FMOD_CREATESOUNDEXINFO fsbguid(@Nullable @NativeType("FMOD_GUID *") FMOD_GUID value) { nfsbguid(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_CREATESOUNDEXINFO set(
        int cbsize,
        int length,
        int fileoffset,
        int numchannels,
        int defaultfrequency,
        int format,
        int decodebuffersize,
        int initialsubsound,
        int numsubsounds,
        IntBuffer inclusionlist,
        @Nullable FMOD_SOUND_PCMREAD_CALLBACKI pcmreadcallback,
        @Nullable FMOD_SOUND_PCMSETPOS_CALLBACKI pcmsetposcallback,
        @Nullable FMOD_SOUND_NONBLOCK_CALLBACKI nonblockcallback,
        @Nullable ByteBuffer dlsname,
        @Nullable ByteBuffer encryptionkey,
        int maxpolyphony,
        long userdata,
        int suggestedsoundtype,
        @Nullable FMOD_FILE_OPEN_CALLBACKI fileuseropen,
        @Nullable FMOD_FILE_CLOSE_CALLBACKI fileuserclose,
        @Nullable FMOD_FILE_READ_CALLBACKI fileuserread,
        @Nullable FMOD_FILE_SEEK_CALLBACKI fileuserseek,
        @Nullable FMOD_FILE_ASYNCREAD_CALLBACKI fileuserasyncread,
        @Nullable FMOD_FILE_ASYNCCANCEL_CALLBACKI fileuserasynccancel,
        long fileuserdata,
        int filebuffersize,
        int channelorder,
        long initialsoundgroup,
        int initialseekposition,
        int initialseekpostype,
        int ignoresetfilesystem,
        int audioqueuepolicy,
        int minmidigranularity,
        int nonblockthreadid,
        @Nullable FMOD_GUID fsbguid
    ) {
        cbsize(cbsize);
        length(length);
        fileoffset(fileoffset);
        numchannels(numchannels);
        defaultfrequency(defaultfrequency);
        format(format);
        decodebuffersize(decodebuffersize);
        initialsubsound(initialsubsound);
        numsubsounds(numsubsounds);
        inclusionlist(inclusionlist);
        pcmreadcallback(pcmreadcallback);
        pcmsetposcallback(pcmsetposcallback);
        nonblockcallback(nonblockcallback);
        dlsname(dlsname);
        encryptionkey(encryptionkey);
        maxpolyphony(maxpolyphony);
        userdata(userdata);
        suggestedsoundtype(suggestedsoundtype);
        fileuseropen(fileuseropen);
        fileuserclose(fileuserclose);
        fileuserread(fileuserread);
        fileuserseek(fileuserseek);
        fileuserasyncread(fileuserasyncread);
        fileuserasynccancel(fileuserasynccancel);
        fileuserdata(fileuserdata);
        filebuffersize(filebuffersize);
        channelorder(channelorder);
        initialsoundgroup(initialsoundgroup);
        initialseekposition(initialseekposition);
        initialseekpostype(initialseekpostype);
        ignoresetfilesystem(ignoresetfilesystem);
        audioqueuepolicy(audioqueuepolicy);
        minmidigranularity(minmidigranularity);
        nonblockthreadid(nonblockthreadid);
        fsbguid(fsbguid);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_CREATESOUNDEXINFO set(FMOD_CREATESOUNDEXINFO src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_CREATESOUNDEXINFO} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_CREATESOUNDEXINFO malloc() {
        return new FMOD_CREATESOUNDEXINFO(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_CREATESOUNDEXINFO} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_CREATESOUNDEXINFO calloc() {
        return new FMOD_CREATESOUNDEXINFO(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_CREATESOUNDEXINFO} instance allocated with {@link BufferUtils}. */
    public static FMOD_CREATESOUNDEXINFO create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_CREATESOUNDEXINFO(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_CREATESOUNDEXINFO} instance for the specified memory address. */
    public static FMOD_CREATESOUNDEXINFO create(long address) {
        return new FMOD_CREATESOUNDEXINFO(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_CREATESOUNDEXINFO createSafe(long address) {
        return address == NULL ? null : new FMOD_CREATESOUNDEXINFO(address, null);
    }

    /**
     * Returns a new {@link FMOD_CREATESOUNDEXINFO.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_CREATESOUNDEXINFO.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_CREATESOUNDEXINFO.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_CREATESOUNDEXINFO.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_CREATESOUNDEXINFO.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_CREATESOUNDEXINFO.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_CREATESOUNDEXINFO.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_CREATESOUNDEXINFO.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_CREATESOUNDEXINFO.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_CREATESOUNDEXINFO} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_CREATESOUNDEXINFO malloc(MemoryStack stack) {
        return new FMOD_CREATESOUNDEXINFO(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_CREATESOUNDEXINFO} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_CREATESOUNDEXINFO calloc(MemoryStack stack) {
        return new FMOD_CREATESOUNDEXINFO(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_CREATESOUNDEXINFO.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_CREATESOUNDEXINFO.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_CREATESOUNDEXINFO.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_CREATESOUNDEXINFO.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #cbsize}. */
    public static int ncbsize(long struct) { return UNSAFE.getInt(null, struct + FMOD_CREATESOUNDEXINFO.CBSIZE); }
    /** Unsafe version of {@link #length}. */
    public static int nlength(long struct) { return UNSAFE.getInt(null, struct + FMOD_CREATESOUNDEXINFO.LENGTH); }
    /** Unsafe version of {@link #fileoffset}. */
    public static int nfileoffset(long struct) { return UNSAFE.getInt(null, struct + FMOD_CREATESOUNDEXINFO.FILEOFFSET); }
    /** Unsafe version of {@link #numchannels}. */
    public static int nnumchannels(long struct) { return UNSAFE.getInt(null, struct + FMOD_CREATESOUNDEXINFO.NUMCHANNELS); }
    /** Unsafe version of {@link #defaultfrequency}. */
    public static int ndefaultfrequency(long struct) { return UNSAFE.getInt(null, struct + FMOD_CREATESOUNDEXINFO.DEFAULTFREQUENCY); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return UNSAFE.getInt(null, struct + FMOD_CREATESOUNDEXINFO.FORMAT); }
    /** Unsafe version of {@link #decodebuffersize}. */
    public static int ndecodebuffersize(long struct) { return UNSAFE.getInt(null, struct + FMOD_CREATESOUNDEXINFO.DECODEBUFFERSIZE); }
    /** Unsafe version of {@link #initialsubsound}. */
    public static int ninitialsubsound(long struct) { return UNSAFE.getInt(null, struct + FMOD_CREATESOUNDEXINFO.INITIALSUBSOUND); }
    /** Unsafe version of {@link #numsubsounds}. */
    public static int nnumsubsounds(long struct) { return UNSAFE.getInt(null, struct + FMOD_CREATESOUNDEXINFO.NUMSUBSOUNDS); }
    /** Unsafe version of {@link #inclusionlist() inclusionlist}. */
    public static IntBuffer ninclusionlist(long struct) { return memIntBuffer(memGetAddress(struct + FMOD_CREATESOUNDEXINFO.INCLUSIONLIST), ninclusionlistnum(struct)); }
    /** Unsafe version of {@link #inclusionlistnum}. */
    public static int ninclusionlistnum(long struct) { return UNSAFE.getInt(null, struct + FMOD_CREATESOUNDEXINFO.INCLUSIONLISTNUM); }
    /** Unsafe version of {@link #pcmreadcallback}. */
    @Nullable public static FMOD_SOUND_PCMREAD_CALLBACK npcmreadcallback(long struct) { return FMOD_SOUND_PCMREAD_CALLBACK.createSafe(memGetAddress(struct + FMOD_CREATESOUNDEXINFO.PCMREADCALLBACK)); }
    /** Unsafe version of {@link #pcmsetposcallback}. */
    @Nullable public static FMOD_SOUND_PCMSETPOS_CALLBACK npcmsetposcallback(long struct) { return FMOD_SOUND_PCMSETPOS_CALLBACK.createSafe(memGetAddress(struct + FMOD_CREATESOUNDEXINFO.PCMSETPOSCALLBACK)); }
    /** Unsafe version of {@link #nonblockcallback}. */
    @Nullable public static FMOD_SOUND_NONBLOCK_CALLBACK nnonblockcallback(long struct) { return FMOD_SOUND_NONBLOCK_CALLBACK.createSafe(memGetAddress(struct + FMOD_CREATESOUNDEXINFO.NONBLOCKCALLBACK)); }
    /** Unsafe version of {@link #dlsname}. */
    @Nullable public static ByteBuffer ndlsname(long struct) { return memByteBufferNT1Safe(memGetAddress(struct + FMOD_CREATESOUNDEXINFO.DLSNAME)); }
    /** Unsafe version of {@link #dlsnameString}. */
    @Nullable public static String ndlsnameString(long struct) { return memUTF8Safe(memGetAddress(struct + FMOD_CREATESOUNDEXINFO.DLSNAME)); }
    /** Unsafe version of {@link #encryptionkey}. */
    @Nullable public static ByteBuffer nencryptionkey(long struct) { return memByteBufferNT1Safe(memGetAddress(struct + FMOD_CREATESOUNDEXINFO.ENCRYPTIONKEY)); }
    /** Unsafe version of {@link #encryptionkeyString}. */
    @Nullable public static String nencryptionkeyString(long struct) { return memUTF8Safe(memGetAddress(struct + FMOD_CREATESOUNDEXINFO.ENCRYPTIONKEY)); }
    /** Unsafe version of {@link #maxpolyphony}. */
    public static int nmaxpolyphony(long struct) { return UNSAFE.getInt(null, struct + FMOD_CREATESOUNDEXINFO.MAXPOLYPHONY); }
    /** Unsafe version of {@link #userdata}. */
    public static long nuserdata(long struct) { return memGetAddress(struct + FMOD_CREATESOUNDEXINFO.USERDATA); }
    /** Unsafe version of {@link #suggestedsoundtype}. */
    public static int nsuggestedsoundtype(long struct) { return UNSAFE.getInt(null, struct + FMOD_CREATESOUNDEXINFO.SUGGESTEDSOUNDTYPE); }
    /** Unsafe version of {@link #fileuseropen}. */
    @Nullable public static FMOD_FILE_OPEN_CALLBACK nfileuseropen(long struct) { return FMOD_FILE_OPEN_CALLBACK.createSafe(memGetAddress(struct + FMOD_CREATESOUNDEXINFO.FILEUSEROPEN)); }
    /** Unsafe version of {@link #fileuserclose}. */
    @Nullable public static FMOD_FILE_CLOSE_CALLBACK nfileuserclose(long struct) { return FMOD_FILE_CLOSE_CALLBACK.createSafe(memGetAddress(struct + FMOD_CREATESOUNDEXINFO.FILEUSERCLOSE)); }
    /** Unsafe version of {@link #fileuserread}. */
    @Nullable public static FMOD_FILE_READ_CALLBACK nfileuserread(long struct) { return FMOD_FILE_READ_CALLBACK.createSafe(memGetAddress(struct + FMOD_CREATESOUNDEXINFO.FILEUSERREAD)); }
    /** Unsafe version of {@link #fileuserseek}. */
    @Nullable public static FMOD_FILE_SEEK_CALLBACK nfileuserseek(long struct) { return FMOD_FILE_SEEK_CALLBACK.createSafe(memGetAddress(struct + FMOD_CREATESOUNDEXINFO.FILEUSERSEEK)); }
    /** Unsafe version of {@link #fileuserasyncread}. */
    @Nullable public static FMOD_FILE_ASYNCREAD_CALLBACK nfileuserasyncread(long struct) { return FMOD_FILE_ASYNCREAD_CALLBACK.createSafe(memGetAddress(struct + FMOD_CREATESOUNDEXINFO.FILEUSERASYNCREAD)); }
    /** Unsafe version of {@link #fileuserasynccancel}. */
    @Nullable public static FMOD_FILE_ASYNCCANCEL_CALLBACK nfileuserasynccancel(long struct) { return FMOD_FILE_ASYNCCANCEL_CALLBACK.createSafe(memGetAddress(struct + FMOD_CREATESOUNDEXINFO.FILEUSERASYNCCANCEL)); }
    /** Unsafe version of {@link #fileuserdata}. */
    public static long nfileuserdata(long struct) { return memGetAddress(struct + FMOD_CREATESOUNDEXINFO.FILEUSERDATA); }
    /** Unsafe version of {@link #filebuffersize}. */
    public static int nfilebuffersize(long struct) { return UNSAFE.getInt(null, struct + FMOD_CREATESOUNDEXINFO.FILEBUFFERSIZE); }
    /** Unsafe version of {@link #channelorder}. */
    public static int nchannelorder(long struct) { return UNSAFE.getInt(null, struct + FMOD_CREATESOUNDEXINFO.CHANNELORDER); }
    /** Unsafe version of {@link #initialsoundgroup}. */
    public static long ninitialsoundgroup(long struct) { return memGetAddress(struct + FMOD_CREATESOUNDEXINFO.INITIALSOUNDGROUP); }
    /** Unsafe version of {@link #initialseekposition}. */
    public static int ninitialseekposition(long struct) { return UNSAFE.getInt(null, struct + FMOD_CREATESOUNDEXINFO.INITIALSEEKPOSITION); }
    /** Unsafe version of {@link #initialseekpostype}. */
    public static int ninitialseekpostype(long struct) { return UNSAFE.getInt(null, struct + FMOD_CREATESOUNDEXINFO.INITIALSEEKPOSTYPE); }
    /** Unsafe version of {@link #ignoresetfilesystem}. */
    public static int nignoresetfilesystem(long struct) { return UNSAFE.getInt(null, struct + FMOD_CREATESOUNDEXINFO.IGNORESETFILESYSTEM); }
    /** Unsafe version of {@link #audioqueuepolicy}. */
    public static int naudioqueuepolicy(long struct) { return UNSAFE.getInt(null, struct + FMOD_CREATESOUNDEXINFO.AUDIOQUEUEPOLICY); }
    /** Unsafe version of {@link #minmidigranularity}. */
    public static int nminmidigranularity(long struct) { return UNSAFE.getInt(null, struct + FMOD_CREATESOUNDEXINFO.MINMIDIGRANULARITY); }
    /** Unsafe version of {@link #nonblockthreadid}. */
    public static int nnonblockthreadid(long struct) { return UNSAFE.getInt(null, struct + FMOD_CREATESOUNDEXINFO.NONBLOCKTHREADID); }
    /** Unsafe version of {@link #fsbguid}. */
    @Nullable public static FMOD_GUID nfsbguid(long struct) { return FMOD_GUID.createSafe(memGetAddress(struct + FMOD_CREATESOUNDEXINFO.FSBGUID)); }

    /** Unsafe version of {@link #cbsize(int) cbsize}. */
    public static void ncbsize(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_CREATESOUNDEXINFO.CBSIZE, value); }
    /** Unsafe version of {@link #length(int) length}. */
    public static void nlength(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_CREATESOUNDEXINFO.LENGTH, value); }
    /** Unsafe version of {@link #fileoffset(int) fileoffset}. */
    public static void nfileoffset(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_CREATESOUNDEXINFO.FILEOFFSET, value); }
    /** Unsafe version of {@link #numchannels(int) numchannels}. */
    public static void nnumchannels(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_CREATESOUNDEXINFO.NUMCHANNELS, value); }
    /** Unsafe version of {@link #defaultfrequency(int) defaultfrequency}. */
    public static void ndefaultfrequency(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_CREATESOUNDEXINFO.DEFAULTFREQUENCY, value); }
    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_CREATESOUNDEXINFO.FORMAT, value); }
    /** Unsafe version of {@link #decodebuffersize(int) decodebuffersize}. */
    public static void ndecodebuffersize(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_CREATESOUNDEXINFO.DECODEBUFFERSIZE, value); }
    /** Unsafe version of {@link #initialsubsound(int) initialsubsound}. */
    public static void ninitialsubsound(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_CREATESOUNDEXINFO.INITIALSUBSOUND, value); }
    /** Unsafe version of {@link #numsubsounds(int) numsubsounds}. */
    public static void nnumsubsounds(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_CREATESOUNDEXINFO.NUMSUBSOUNDS, value); }
    /** Unsafe version of {@link #inclusionlist(IntBuffer) inclusionlist}. */
    public static void ninclusionlist(long struct, IntBuffer value) { memPutAddress(struct + FMOD_CREATESOUNDEXINFO.INCLUSIONLIST, memAddress(value)); ninclusionlistnum(struct, value.remaining()); }
    /** Sets the specified value to the {@code inclusionlistnum} field of the specified {@code struct}. */
    public static void ninclusionlistnum(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_CREATESOUNDEXINFO.INCLUSIONLISTNUM, value); }
    /** Unsafe version of {@link #pcmreadcallback(FMOD_SOUND_PCMREAD_CALLBACKI) pcmreadcallback}. */
    public static void npcmreadcallback(long struct, @Nullable FMOD_SOUND_PCMREAD_CALLBACKI value) { memPutAddress(struct + FMOD_CREATESOUNDEXINFO.PCMREADCALLBACK, memAddressSafe(value)); }
    /** Unsafe version of {@link #pcmsetposcallback(FMOD_SOUND_PCMSETPOS_CALLBACKI) pcmsetposcallback}. */
    public static void npcmsetposcallback(long struct, @Nullable FMOD_SOUND_PCMSETPOS_CALLBACKI value) { memPutAddress(struct + FMOD_CREATESOUNDEXINFO.PCMSETPOSCALLBACK, memAddressSafe(value)); }
    /** Unsafe version of {@link #nonblockcallback(FMOD_SOUND_NONBLOCK_CALLBACKI) nonblockcallback}. */
    public static void nnonblockcallback(long struct, @Nullable FMOD_SOUND_NONBLOCK_CALLBACKI value) { memPutAddress(struct + FMOD_CREATESOUNDEXINFO.NONBLOCKCALLBACK, memAddressSafe(value)); }
    /** Unsafe version of {@link #dlsname(ByteBuffer) dlsname}. */
    public static void ndlsname(long struct, @Nullable ByteBuffer value) {
        if (CHECKS) { checkNT1Safe(value); }
        memPutAddress(struct + FMOD_CREATESOUNDEXINFO.DLSNAME, memAddressSafe(value));
    }
    /** Unsafe version of {@link #encryptionkey(ByteBuffer) encryptionkey}. */
    public static void nencryptionkey(long struct, @Nullable ByteBuffer value) {
        if (CHECKS) { checkNT1Safe(value); }
        memPutAddress(struct + FMOD_CREATESOUNDEXINFO.ENCRYPTIONKEY, memAddressSafe(value));
    }
    /** Unsafe version of {@link #maxpolyphony(int) maxpolyphony}. */
    public static void nmaxpolyphony(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_CREATESOUNDEXINFO.MAXPOLYPHONY, value); }
    /** Unsafe version of {@link #userdata(long) userdata}. */
    public static void nuserdata(long struct, long value) { memPutAddress(struct + FMOD_CREATESOUNDEXINFO.USERDATA, value); }
    /** Unsafe version of {@link #suggestedsoundtype(int) suggestedsoundtype}. */
    public static void nsuggestedsoundtype(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_CREATESOUNDEXINFO.SUGGESTEDSOUNDTYPE, value); }
    /** Unsafe version of {@link #fileuseropen(FMOD_FILE_OPEN_CALLBACKI) fileuseropen}. */
    public static void nfileuseropen(long struct, @Nullable FMOD_FILE_OPEN_CALLBACKI value) { memPutAddress(struct + FMOD_CREATESOUNDEXINFO.FILEUSEROPEN, memAddressSafe(value)); }
    /** Unsafe version of {@link #fileuserclose(FMOD_FILE_CLOSE_CALLBACKI) fileuserclose}. */
    public static void nfileuserclose(long struct, @Nullable FMOD_FILE_CLOSE_CALLBACKI value) { memPutAddress(struct + FMOD_CREATESOUNDEXINFO.FILEUSERCLOSE, memAddressSafe(value)); }
    /** Unsafe version of {@link #fileuserread(FMOD_FILE_READ_CALLBACKI) fileuserread}. */
    public static void nfileuserread(long struct, @Nullable FMOD_FILE_READ_CALLBACKI value) { memPutAddress(struct + FMOD_CREATESOUNDEXINFO.FILEUSERREAD, memAddressSafe(value)); }
    /** Unsafe version of {@link #fileuserseek(FMOD_FILE_SEEK_CALLBACKI) fileuserseek}. */
    public static void nfileuserseek(long struct, @Nullable FMOD_FILE_SEEK_CALLBACKI value) { memPutAddress(struct + FMOD_CREATESOUNDEXINFO.FILEUSERSEEK, memAddressSafe(value)); }
    /** Unsafe version of {@link #fileuserasyncread(FMOD_FILE_ASYNCREAD_CALLBACKI) fileuserasyncread}. */
    public static void nfileuserasyncread(long struct, @Nullable FMOD_FILE_ASYNCREAD_CALLBACKI value) { memPutAddress(struct + FMOD_CREATESOUNDEXINFO.FILEUSERASYNCREAD, memAddressSafe(value)); }
    /** Unsafe version of {@link #fileuserasynccancel(FMOD_FILE_ASYNCCANCEL_CALLBACKI) fileuserasynccancel}. */
    public static void nfileuserasynccancel(long struct, @Nullable FMOD_FILE_ASYNCCANCEL_CALLBACKI value) { memPutAddress(struct + FMOD_CREATESOUNDEXINFO.FILEUSERASYNCCANCEL, memAddressSafe(value)); }
    /** Unsafe version of {@link #fileuserdata(long) fileuserdata}. */
    public static void nfileuserdata(long struct, long value) { memPutAddress(struct + FMOD_CREATESOUNDEXINFO.FILEUSERDATA, value); }
    /** Unsafe version of {@link #filebuffersize(int) filebuffersize}. */
    public static void nfilebuffersize(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_CREATESOUNDEXINFO.FILEBUFFERSIZE, value); }
    /** Unsafe version of {@link #channelorder(int) channelorder}. */
    public static void nchannelorder(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_CREATESOUNDEXINFO.CHANNELORDER, value); }
    /** Unsafe version of {@link #initialsoundgroup(long) initialsoundgroup}. */
    public static void ninitialsoundgroup(long struct, long value) { memPutAddress(struct + FMOD_CREATESOUNDEXINFO.INITIALSOUNDGROUP, value); }
    /** Unsafe version of {@link #initialseekposition(int) initialseekposition}. */
    public static void ninitialseekposition(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_CREATESOUNDEXINFO.INITIALSEEKPOSITION, value); }
    /** Unsafe version of {@link #initialseekpostype(int) initialseekpostype}. */
    public static void ninitialseekpostype(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_CREATESOUNDEXINFO.INITIALSEEKPOSTYPE, value); }
    /** Unsafe version of {@link #ignoresetfilesystem(int) ignoresetfilesystem}. */
    public static void nignoresetfilesystem(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_CREATESOUNDEXINFO.IGNORESETFILESYSTEM, value); }
    /** Unsafe version of {@link #audioqueuepolicy(int) audioqueuepolicy}. */
    public static void naudioqueuepolicy(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_CREATESOUNDEXINFO.AUDIOQUEUEPOLICY, value); }
    /** Unsafe version of {@link #minmidigranularity(int) minmidigranularity}. */
    public static void nminmidigranularity(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_CREATESOUNDEXINFO.MINMIDIGRANULARITY, value); }
    /** Unsafe version of {@link #nonblockthreadid(int) nonblockthreadid}. */
    public static void nnonblockthreadid(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_CREATESOUNDEXINFO.NONBLOCKTHREADID, value); }
    /** Unsafe version of {@link #fsbguid(FMOD_GUID) fsbguid}. */
    public static void nfsbguid(long struct, @Nullable FMOD_GUID value) { memPutAddress(struct + FMOD_CREATESOUNDEXINFO.FSBGUID, memAddressSafe(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + FMOD_CREATESOUNDEXINFO.INCLUSIONLIST));
    }

    // -----------------------------------

    /** An array of {@link FMOD_CREATESOUNDEXINFO} structs. */
    public static class Buffer extends StructBuffer<FMOD_CREATESOUNDEXINFO, Buffer> implements NativeResource {

        private static final FMOD_CREATESOUNDEXINFO ELEMENT_FACTORY = FMOD_CREATESOUNDEXINFO.create(-1L);

        /**
         * Creates a new {@code FMOD_CREATESOUNDEXINFO.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_CREATESOUNDEXINFO#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_CREATESOUNDEXINFO getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code cbsize} field. */
        public int cbsize() { return FMOD_CREATESOUNDEXINFO.ncbsize(address()); }
        /** @return the value of the {@code length} field. */
        @NativeType("unsigned int")
        public int length() { return FMOD_CREATESOUNDEXINFO.nlength(address()); }
        /** @return the value of the {@code fileoffset} field. */
        @NativeType("unsigned int")
        public int fileoffset() { return FMOD_CREATESOUNDEXINFO.nfileoffset(address()); }
        /** @return the value of the {@code numchannels} field. */
        public int numchannels() { return FMOD_CREATESOUNDEXINFO.nnumchannels(address()); }
        /** @return the value of the {@code defaultfrequency} field. */
        public int defaultfrequency() { return FMOD_CREATESOUNDEXINFO.ndefaultfrequency(address()); }
        /** @return the value of the {@code format} field. */
        @NativeType("FMOD_SOUND_FORMAT")
        public int format() { return FMOD_CREATESOUNDEXINFO.nformat(address()); }
        /** @return the value of the {@code decodebuffersize} field. */
        @NativeType("unsigned int")
        public int decodebuffersize() { return FMOD_CREATESOUNDEXINFO.ndecodebuffersize(address()); }
        /** @return the value of the {@code initialsubsound} field. */
        public int initialsubsound() { return FMOD_CREATESOUNDEXINFO.ninitialsubsound(address()); }
        /** @return the value of the {@code numsubsounds} field. */
        public int numsubsounds() { return FMOD_CREATESOUNDEXINFO.nnumsubsounds(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code inclusionlist} field. */
        @NativeType("int *")
        public IntBuffer inclusionlist() { return FMOD_CREATESOUNDEXINFO.ninclusionlist(address()); }
        /** @return the value of the {@code inclusionlistnum} field. */
        public int inclusionlistnum() { return FMOD_CREATESOUNDEXINFO.ninclusionlistnum(address()); }
        /** @return the value of the {@code pcmreadcallback} field. */
        @Nullable
        public FMOD_SOUND_PCMREAD_CALLBACK pcmreadcallback() { return FMOD_CREATESOUNDEXINFO.npcmreadcallback(address()); }
        /** @return the value of the {@code pcmsetposcallback} field. */
        @Nullable
        public FMOD_SOUND_PCMSETPOS_CALLBACK pcmsetposcallback() { return FMOD_CREATESOUNDEXINFO.npcmsetposcallback(address()); }
        /** @return the value of the {@code nonblockcallback} field. */
        @Nullable
        public FMOD_SOUND_NONBLOCK_CALLBACK nonblockcallback() { return FMOD_CREATESOUNDEXINFO.nnonblockcallback(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code dlsname} field. */
        @Nullable
        @NativeType("char const *")
        public ByteBuffer dlsname() { return FMOD_CREATESOUNDEXINFO.ndlsname(address()); }
        /** @return the null-terminated string pointed to by the {@code dlsname} field. */
        @Nullable
        @NativeType("char const *")
        public String dlsnameString() { return FMOD_CREATESOUNDEXINFO.ndlsnameString(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code encryptionkey} field. */
        @Nullable
        @NativeType("char const *")
        public ByteBuffer encryptionkey() { return FMOD_CREATESOUNDEXINFO.nencryptionkey(address()); }
        /** @return the null-terminated string pointed to by the {@code encryptionkey} field. */
        @Nullable
        @NativeType("char const *")
        public String encryptionkeyString() { return FMOD_CREATESOUNDEXINFO.nencryptionkeyString(address()); }
        /** @return the value of the {@code maxpolyphony} field. */
        public int maxpolyphony() { return FMOD_CREATESOUNDEXINFO.nmaxpolyphony(address()); }
        /** @return the value of the {@code userdata} field. */
        @NativeType("void *")
        public long userdata() { return FMOD_CREATESOUNDEXINFO.nuserdata(address()); }
        /** @return the value of the {@code suggestedsoundtype} field. */
        @NativeType("FMOD_SOUND_TYPE")
        public int suggestedsoundtype() { return FMOD_CREATESOUNDEXINFO.nsuggestedsoundtype(address()); }
        /** @return the value of the {@code fileuseropen} field. */
        @Nullable
        public FMOD_FILE_OPEN_CALLBACK fileuseropen() { return FMOD_CREATESOUNDEXINFO.nfileuseropen(address()); }
        /** @return the value of the {@code fileuserclose} field. */
        @Nullable
        public FMOD_FILE_CLOSE_CALLBACK fileuserclose() { return FMOD_CREATESOUNDEXINFO.nfileuserclose(address()); }
        /** @return the value of the {@code fileuserread} field. */
        @Nullable
        public FMOD_FILE_READ_CALLBACK fileuserread() { return FMOD_CREATESOUNDEXINFO.nfileuserread(address()); }
        /** @return the value of the {@code fileuserseek} field. */
        @Nullable
        public FMOD_FILE_SEEK_CALLBACK fileuserseek() { return FMOD_CREATESOUNDEXINFO.nfileuserseek(address()); }
        /** @return the value of the {@code fileuserasyncread} field. */
        @Nullable
        public FMOD_FILE_ASYNCREAD_CALLBACK fileuserasyncread() { return FMOD_CREATESOUNDEXINFO.nfileuserasyncread(address()); }
        /** @return the value of the {@code fileuserasynccancel} field. */
        @Nullable
        public FMOD_FILE_ASYNCCANCEL_CALLBACK fileuserasynccancel() { return FMOD_CREATESOUNDEXINFO.nfileuserasynccancel(address()); }
        /** @return the value of the {@code fileuserdata} field. */
        @NativeType("void *")
        public long fileuserdata() { return FMOD_CREATESOUNDEXINFO.nfileuserdata(address()); }
        /** @return the value of the {@code filebuffersize} field. */
        public int filebuffersize() { return FMOD_CREATESOUNDEXINFO.nfilebuffersize(address()); }
        /** @return the value of the {@code channelorder} field. */
        @NativeType("FMOD_CHANNELORDER")
        public int channelorder() { return FMOD_CREATESOUNDEXINFO.nchannelorder(address()); }
        /** @return the value of the {@code initialsoundgroup} field. */
        @NativeType("FMOD_SOUNDGROUP *")
        public long initialsoundgroup() { return FMOD_CREATESOUNDEXINFO.ninitialsoundgroup(address()); }
        /** @return the value of the {@code initialseekposition} field. */
        @NativeType("unsigned int")
        public int initialseekposition() { return FMOD_CREATESOUNDEXINFO.ninitialseekposition(address()); }
        /** @return the value of the {@code initialseekpostype} field. */
        @NativeType("FMOD_TIMEUNIT")
        public int initialseekpostype() { return FMOD_CREATESOUNDEXINFO.ninitialseekpostype(address()); }
        /** @return the value of the {@code ignoresetfilesystem} field. */
        public int ignoresetfilesystem() { return FMOD_CREATESOUNDEXINFO.nignoresetfilesystem(address()); }
        /** @return the value of the {@code audioqueuepolicy} field. */
        @NativeType("unsigned int")
        public int audioqueuepolicy() { return FMOD_CREATESOUNDEXINFO.naudioqueuepolicy(address()); }
        /** @return the value of the {@code minmidigranularity} field. */
        @NativeType("unsigned int")
        public int minmidigranularity() { return FMOD_CREATESOUNDEXINFO.nminmidigranularity(address()); }
        /** @return the value of the {@code nonblockthreadid} field. */
        public int nonblockthreadid() { return FMOD_CREATESOUNDEXINFO.nnonblockthreadid(address()); }
        /** @return a {@link FMOD_GUID} view of the struct pointed to by the {@code fsbguid} field. */
        @Nullable
        @NativeType("FMOD_GUID *")
        public FMOD_GUID fsbguid() { return FMOD_CREATESOUNDEXINFO.nfsbguid(address()); }

        /** Sets the specified value to the {@code cbsize} field. */
        public FMOD_CREATESOUNDEXINFO.Buffer cbsize(int value) { FMOD_CREATESOUNDEXINFO.ncbsize(address(), value); return this; }
        /** Sets the specified value to the {@code length} field. */
        public FMOD_CREATESOUNDEXINFO.Buffer length(@NativeType("unsigned int") int value) { FMOD_CREATESOUNDEXINFO.nlength(address(), value); return this; }
        /** Sets the specified value to the {@code fileoffset} field. */
        public FMOD_CREATESOUNDEXINFO.Buffer fileoffset(@NativeType("unsigned int") int value) { FMOD_CREATESOUNDEXINFO.nfileoffset(address(), value); return this; }
        /** Sets the specified value to the {@code numchannels} field. */
        public FMOD_CREATESOUNDEXINFO.Buffer numchannels(int value) { FMOD_CREATESOUNDEXINFO.nnumchannels(address(), value); return this; }
        /** Sets the specified value to the {@code defaultfrequency} field. */
        public FMOD_CREATESOUNDEXINFO.Buffer defaultfrequency(int value) { FMOD_CREATESOUNDEXINFO.ndefaultfrequency(address(), value); return this; }
        /** Sets the specified value to the {@code format} field. */
        public FMOD_CREATESOUNDEXINFO.Buffer format(@NativeType("FMOD_SOUND_FORMAT") int value) { FMOD_CREATESOUNDEXINFO.nformat(address(), value); return this; }
        /** Sets the specified value to the {@code decodebuffersize} field. */
        public FMOD_CREATESOUNDEXINFO.Buffer decodebuffersize(@NativeType("unsigned int") int value) { FMOD_CREATESOUNDEXINFO.ndecodebuffersize(address(), value); return this; }
        /** Sets the specified value to the {@code initialsubsound} field. */
        public FMOD_CREATESOUNDEXINFO.Buffer initialsubsound(int value) { FMOD_CREATESOUNDEXINFO.ninitialsubsound(address(), value); return this; }
        /** Sets the specified value to the {@code numsubsounds} field. */
        public FMOD_CREATESOUNDEXINFO.Buffer numsubsounds(int value) { FMOD_CREATESOUNDEXINFO.nnumsubsounds(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code inclusionlist} field. */
        public FMOD_CREATESOUNDEXINFO.Buffer inclusionlist(@NativeType("int *") IntBuffer value) { FMOD_CREATESOUNDEXINFO.ninclusionlist(address(), value); return this; }
        /** Sets the specified value to the {@code pcmreadcallback} field. */
        public FMOD_CREATESOUNDEXINFO.Buffer pcmreadcallback(@Nullable @NativeType("FMOD_SOUND_PCMREAD_CALLBACK") FMOD_SOUND_PCMREAD_CALLBACKI value) { FMOD_CREATESOUNDEXINFO.npcmreadcallback(address(), value); return this; }
        /** Sets the specified value to the {@code pcmsetposcallback} field. */
        public FMOD_CREATESOUNDEXINFO.Buffer pcmsetposcallback(@Nullable @NativeType("FMOD_SOUND_PCMSETPOS_CALLBACK") FMOD_SOUND_PCMSETPOS_CALLBACKI value) { FMOD_CREATESOUNDEXINFO.npcmsetposcallback(address(), value); return this; }
        /** Sets the specified value to the {@code nonblockcallback} field. */
        public FMOD_CREATESOUNDEXINFO.Buffer nonblockcallback(@Nullable @NativeType("FMOD_SOUND_NONBLOCK_CALLBACK") FMOD_SOUND_NONBLOCK_CALLBACKI value) { FMOD_CREATESOUNDEXINFO.nnonblockcallback(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code dlsname} field. */
        public FMOD_CREATESOUNDEXINFO.Buffer dlsname(@Nullable @NativeType("char const *") ByteBuffer value) { FMOD_CREATESOUNDEXINFO.ndlsname(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code encryptionkey} field. */
        public FMOD_CREATESOUNDEXINFO.Buffer encryptionkey(@Nullable @NativeType("char const *") ByteBuffer value) { FMOD_CREATESOUNDEXINFO.nencryptionkey(address(), value); return this; }
        /** Sets the specified value to the {@code maxpolyphony} field. */
        public FMOD_CREATESOUNDEXINFO.Buffer maxpolyphony(int value) { FMOD_CREATESOUNDEXINFO.nmaxpolyphony(address(), value); return this; }
        /** Sets the specified value to the {@code userdata} field. */
        public FMOD_CREATESOUNDEXINFO.Buffer userdata(@NativeType("void *") long value) { FMOD_CREATESOUNDEXINFO.nuserdata(address(), value); return this; }
        /** Sets the specified value to the {@code suggestedsoundtype} field. */
        public FMOD_CREATESOUNDEXINFO.Buffer suggestedsoundtype(@NativeType("FMOD_SOUND_TYPE") int value) { FMOD_CREATESOUNDEXINFO.nsuggestedsoundtype(address(), value); return this; }
        /** Sets the specified value to the {@code fileuseropen} field. */
        public FMOD_CREATESOUNDEXINFO.Buffer fileuseropen(@Nullable @NativeType("FMOD_FILE_OPEN_CALLBACK") FMOD_FILE_OPEN_CALLBACKI value) { FMOD_CREATESOUNDEXINFO.nfileuseropen(address(), value); return this; }
        /** Sets the specified value to the {@code fileuserclose} field. */
        public FMOD_CREATESOUNDEXINFO.Buffer fileuserclose(@Nullable @NativeType("FMOD_FILE_CLOSE_CALLBACK") FMOD_FILE_CLOSE_CALLBACKI value) { FMOD_CREATESOUNDEXINFO.nfileuserclose(address(), value); return this; }
        /** Sets the specified value to the {@code fileuserread} field. */
        public FMOD_CREATESOUNDEXINFO.Buffer fileuserread(@Nullable @NativeType("FMOD_FILE_READ_CALLBACK") FMOD_FILE_READ_CALLBACKI value) { FMOD_CREATESOUNDEXINFO.nfileuserread(address(), value); return this; }
        /** Sets the specified value to the {@code fileuserseek} field. */
        public FMOD_CREATESOUNDEXINFO.Buffer fileuserseek(@Nullable @NativeType("FMOD_FILE_SEEK_CALLBACK") FMOD_FILE_SEEK_CALLBACKI value) { FMOD_CREATESOUNDEXINFO.nfileuserseek(address(), value); return this; }
        /** Sets the specified value to the {@code fileuserasyncread} field. */
        public FMOD_CREATESOUNDEXINFO.Buffer fileuserasyncread(@Nullable @NativeType("FMOD_FILE_ASYNCREAD_CALLBACK") FMOD_FILE_ASYNCREAD_CALLBACKI value) { FMOD_CREATESOUNDEXINFO.nfileuserasyncread(address(), value); return this; }
        /** Sets the specified value to the {@code fileuserasynccancel} field. */
        public FMOD_CREATESOUNDEXINFO.Buffer fileuserasynccancel(@Nullable @NativeType("FMOD_FILE_ASYNCCANCEL_CALLBACK") FMOD_FILE_ASYNCCANCEL_CALLBACKI value) { FMOD_CREATESOUNDEXINFO.nfileuserasynccancel(address(), value); return this; }
        /** Sets the specified value to the {@code fileuserdata} field. */
        public FMOD_CREATESOUNDEXINFO.Buffer fileuserdata(@NativeType("void *") long value) { FMOD_CREATESOUNDEXINFO.nfileuserdata(address(), value); return this; }
        /** Sets the specified value to the {@code filebuffersize} field. */
        public FMOD_CREATESOUNDEXINFO.Buffer filebuffersize(int value) { FMOD_CREATESOUNDEXINFO.nfilebuffersize(address(), value); return this; }
        /** Sets the specified value to the {@code channelorder} field. */
        public FMOD_CREATESOUNDEXINFO.Buffer channelorder(@NativeType("FMOD_CHANNELORDER") int value) { FMOD_CREATESOUNDEXINFO.nchannelorder(address(), value); return this; }
        /** Sets the specified value to the {@code initialsoundgroup} field. */
        public FMOD_CREATESOUNDEXINFO.Buffer initialsoundgroup(@NativeType("FMOD_SOUNDGROUP *") long value) { FMOD_CREATESOUNDEXINFO.ninitialsoundgroup(address(), value); return this; }
        /** Sets the specified value to the {@code initialseekposition} field. */
        public FMOD_CREATESOUNDEXINFO.Buffer initialseekposition(@NativeType("unsigned int") int value) { FMOD_CREATESOUNDEXINFO.ninitialseekposition(address(), value); return this; }
        /** Sets the specified value to the {@code initialseekpostype} field. */
        public FMOD_CREATESOUNDEXINFO.Buffer initialseekpostype(@NativeType("FMOD_TIMEUNIT") int value) { FMOD_CREATESOUNDEXINFO.ninitialseekpostype(address(), value); return this; }
        /** Sets the specified value to the {@code ignoresetfilesystem} field. */
        public FMOD_CREATESOUNDEXINFO.Buffer ignoresetfilesystem(int value) { FMOD_CREATESOUNDEXINFO.nignoresetfilesystem(address(), value); return this; }
        /** Sets the specified value to the {@code audioqueuepolicy} field. */
        public FMOD_CREATESOUNDEXINFO.Buffer audioqueuepolicy(@NativeType("unsigned int") int value) { FMOD_CREATESOUNDEXINFO.naudioqueuepolicy(address(), value); return this; }
        /** Sets the specified value to the {@code minmidigranularity} field. */
        public FMOD_CREATESOUNDEXINFO.Buffer minmidigranularity(@NativeType("unsigned int") int value) { FMOD_CREATESOUNDEXINFO.nminmidigranularity(address(), value); return this; }
        /** Sets the specified value to the {@code nonblockthreadid} field. */
        public FMOD_CREATESOUNDEXINFO.Buffer nonblockthreadid(int value) { FMOD_CREATESOUNDEXINFO.nnonblockthreadid(address(), value); return this; }
        /** Sets the address of the specified {@link FMOD_GUID} to the {@code fsbguid} field. */
        public FMOD_CREATESOUNDEXINFO.Buffer fsbguid(@Nullable @NativeType("FMOD_GUID *") FMOD_GUID value) { FMOD_CREATESOUNDEXINFO.nfsbguid(address(), value); return this; }

    }

}