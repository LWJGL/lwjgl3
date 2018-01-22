/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#ifndef OPTION_H
#define OPTION_H

#include <cstring>

static inline int match(const char* opt, const char* lname)
{
    while (*lname && *opt && *opt != '=')
    {
        if (*opt != *lname) { return 0; }

        opt++; lname++;
    }

    return !(*lname) && (!(*opt) || *opt == '=');
}

class Option
{
public:
    Option(void);
    void Reset(void);
    int GetIndex(void);
    typedef struct
    {
        int sname;
        const char* lname;
    } Definition;
    enum State
    {
        DONE,
        LONG,
        SHORT,
        ARG
    };
    int Parse(int argc, char* argv[], const Definition* def);
    const char* GetArgument(int argc, char* argv[]);
private:
    void Advance(int argc, char* argv[]);
    int index;
    const char* where;
    int state;
};

Option::Option(void)
{
    Reset();
}

int
Option::
GetIndex(void)
{
    return index;
}

const char*
Option::
GetArgument(int argc, char* argv[])
{
    Advance(argc, argv);
    const char* arg = where;
    where = NULL;
    return arg;
}

void
Option::
Reset(void)
{
    index = 1;
    where = NULL;
    state = DONE;
}

void
Option::
Advance(int argc, char* argv[])
{
    if (!where || !(*where))
    {
        if (index < argc)
        {
            where = argv[index++];

            if (*where == '-')
            {
                where++;

                if (*where == '-')
                {
                    where++;

                    if (!(*where)) { state = DONE; }
                    else { state = LONG; }
                }
                else { state = SHORT; }
            }
            else { state = ARG; }
        }
        else { state = DONE; }
    }
}

int
Option::
Parse(int argc, char* argv[], const Definition* def)
{
    // advance to next command line option if needed
    Advance(argc, argv);

    // move to next argument
    switch (state)
    {
        case SHORT:
            for (; def->sname; def++)
            {
                if (def->sname == *where)
                {
                    where++;
                    return def->sname;
                }
            }

            return '?';

        case LONG:
            for (; def->lname; def++)
            {
                if (match(where, def->lname))
                {
                    where += strcspn(where, "=") + 1;
                    return def->sname;
                }
            }

            return '?';

        case ARG:
            return '?';

        default:
            return -1;
    }
}

#endif
