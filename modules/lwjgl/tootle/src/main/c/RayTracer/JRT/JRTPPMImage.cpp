/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#include "TootlePCH.h"
#include "JRTCommon.h"
#include "JRTPPMImage.h"


/********************************************************/
/****** Implementation of Class JRTPPMJRTPPMImage *******************/
/********************************************************/


/***************************
* JRTPPMImage Constructor:
*   Sets the width and height of the image, in pixels
*  allocates memory for pixels.  Each pixel is initialized to
*  0,0,0 (black)
***************************/
JRTPPMImage::JRTPPMImage(int width, int height)
{
    p_mlpPixels = NULL;
    p_miWidth = 0;
    p_miHeight = 0;
    AllocPixels(width, height);
}


JRTPPMImage::JRTPPMImage(const JRTPPMImage& img)
{
    *this = img;
}

const JRTPPMImage& JRTPPMImage::operator =(const JRTPPMImage& img)
{
    FreePixels();
    this->p_miHeight = img.p_miHeight;
    this->p_miWidth = img.p_miWidth;
    this->p_mlpPixels = new PIXEL[ GetWidth() * GetHeight() ];
    memcpy(this->p_mlpPixels, img.p_mlpPixels, sizeof(PIXEL)*GetWidth()*GetHeight());

    return *this;
}


/***************************
* JRTPPMImage Destructor:
*   Frees all dynamic memory.
***************************/

JRTPPMImage::~JRTPPMImage()
{
    FreePixels();
}



double Round(double x)
{
    double frac = x - floor(x);

    if (frac > 0.5)
    {
        return ceil(x);
    }
    else
    {
        return floor(x);
    }
}

void JRTPPMImage::SetPixel(int x, int y, float r, float g, float b)
{
    if (x >= 0 && x < p_miWidth && y >= 0 && y < p_miHeight)
    {
        p_mlpPixels[y * p_miWidth + x].r = (unsigned char)Round(r * 255.0);
        p_mlpPixels[y * p_miWidth + x].g = (unsigned char)Round(g * 255.0);
        p_mlpPixels[y * p_miWidth + x].b = (unsigned char)Round(b * 255.0);
    }
}



/******************************
* SaveFile
*   Outputs the image to a PPM (P6) file
*   with the specified filename.  Returns true if the
*   output was a success, false if not.
*********************************/

bool JRTPPMImage::SaveFile(const char* sFile)
{
    // binary write must be specified or this code blows up
    // on windows
    FILE* fp = fopen(sFile, "wb");


    // sanity check
    if (fp == NULL)
    {
        return false;
    }

    // print PPM header stuff
    fprintf(fp, "P6\n%d %d\n%d\n", this->p_miWidth, this->p_miHeight, 255);




    // iterate across pixels and dump them to the file
    for (int row = 0; row < p_miHeight; row++)
    {
        for (int col = 0; col < p_miWidth; col++)
        {
            const PIXEL& pix = p_mlpPixels[(row * p_miWidth) + col];
            fwrite(&pix, 3, 1, fp);
        }

        // repeat for next pixel
    }

    fclose(fp);

    return true;

}



/*
    Helper function for parsing the headers of PPM files
*/
void ISkipToToken(FILE* fp)
{
    bool hit_token = false;

    while (!feof(fp) && !hit_token)
    {
        // skip to beginning of next token (width, height, or maxval)
        int c = fgetc(fp);

        if (c == '#')
        {
            // comment, skip ahead till next newline
            while (!feof(fp) && c != '\n' && c != '\f' && c != '\r')
            {
                c = fgetc(fp);
            }
        }
        else if (c == '\n' || c == '\f' || c == '\r' || c == '\t' || c == ' ')
        {
            // whitespace, skip it
        }
        else
        {
            hit_token = true;

            // we need that character we just read, so backtrack so we're pointed at it
            ungetc(c, fp);
        }
    }

}




bool JRTPPMImage::LoadFile(const char* filename)
{
    // try and open the image file
    FILE* fp = fopen(filename, "rb");

    if (fp == NULL)
    {
        return false;
    }

    /*
        For reference, here is the PPM image format description, direct from the ppm man page.
        
        A "magic number" for identifying the file type. A ppm file's magic number is the two characters "P3".
        Whitespace (blanks, TABs, CRs, LFs).
        A width, formatted as ASCII characters in decimal.
        Whitespace.
        A height, again in ASCII decimal.
        Whitespace.
        The maximum color-component value, again in ASCII decimal.
        Whitespace.
        Width * height pixels, each three ASCII decimal values between 0 and the specified maximum value, starting at the top-left
        corner of the pixmap, proceeding in normal English reading order. The three values for each pixel represent red,
        green, and blue, respectively; a value of 0 means that color is off, and the maximum value means that color is maxxed out.
        Characters from a "#" to the next end-of-line are ignored (comments).
        No line should be longer than 70 characters.

        The "magic number" is "P6" instead of "P3".
        The pixel values are stored as plain bytes, instead of ASCII decimal.
        Whitespace is not allowed in the pixels area, and only a single character of whitespace (typically a newline) is
        allowed after the maxval.
    */

    // first two bytes had better be "P6"
    if (fgetc(fp) != 'P')
    {
        fclose(fp);
        return false;
    }

    if (fgetc(fp) != '6')
    {
        fclose(fp);
        return false;
    }

    UINT width = 0, height = 0, maxval = 0;

    // parse out the width, height, and maxval, ignoring whitespace and comments.
    bool at_bits = false, got_width = false, got_height = false, got_maxval = false;

    while (!at_bits && !feof(fp))
    {
        ISkipToToken(fp);

        if (!got_width)
        {
            // read width
            if (fscanf(fp, "%d", &width) != 1)
            {
                fclose(fp);
                return false;
            }

            got_width = true;
        }
        else if (!got_height)
        {
            // read height
            if (fscanf(fp, "%d", &height) != 1)
            {
                fclose(fp);
                return false;
            }

            got_height = true;
        }
        else if (!got_maxval)
        {
            // read maxval
            if (fscanf(fp, "%d", &maxval) != 1)
            {
                fclose(fp);
                return false;
            }

            got_maxval = true;
            at_bits = true;
        }
    }

    // verify that we got all the header information we needed
    // if we're EOF, it means we did not
    if (feof(fp) && (!got_width || !got_height || !got_maxval))
    {
        fclose(fp);
        return false;
    }

    // there are now 3*width*height bytes left in the file.
    // excluding the extraneous whitespace that may or may not be there
    // allocate enough space for the rest of the data
    unsigned char* bytes = (unsigned char*)malloc(3 * width * height);


    // store current file position
    long offs = ftell(fp);


    // read the data
    size_t bytes_read = fread(bytes, 1, 3 * width * height, fp);

    if (bytes_read < 3 * width * height)
    {
        // not enough bytes
        fclose(fp);
        free(bytes);
        return false;
    }
    else if (!feof(fp))
    {
        // still more data in file, means that there was
        // extraneous whitespace before that needs to be skipped

        int extra_bytes = 0;

        while (!feof(fp))
        {
            extra_bytes++;
            fgetc(fp);
        }

        extra_bytes--; // disregard EOF character

        fseek(fp, offs, SEEK_SET);

        for (int i = 0; i < extra_bytes; i++)
        {
            fgetc(fp);
        }

        bytes_read = fread(bytes, 1, 3 * width * height, fp);

        if (bytes_read != 3 * width * height)
        {
            // something is wrong
            fclose(fp);
            free(bytes);
            return false;
        }
    }



    // convert data to double and copy it
    AllocPixels(width, height);
    int i = 0;

    for (int y = 0; y < GetHeight(); y++)
    {
        for (int x = 0; x < GetWidth(); x++)
        {
            float r = bytes[i]   / (float)maxval;
            float g = bytes[i + 1] / (float)maxval;
            float b = bytes[i + 2] / (float)maxval;
            i += 3;
            SetPixel(x, y, r, g, b);
        }

    }

    free(bytes);
    return true;
}





void JRTPPMImage::AllocPixels(int iWidth, int iHeight)
{
    // prevent accidental memory leaks
    if (p_mlpPixels != NULL)
    {
        FreePixels();
    }

    p_miWidth = iWidth;
    p_miHeight = iHeight;

    // and make new pixel memory
    p_mlpPixels = new PIXEL[p_miHeight * p_miWidth];
}



void JRTPPMImage::FreePixels()
{
    delete[] p_mlpPixels;
    p_mlpPixels = NULL;
}


PIXEL* JRTPPMImage::AccessPixel(int x, int y)
{
    return &p_mlpPixels[ y * p_miWidth + x ];
}


