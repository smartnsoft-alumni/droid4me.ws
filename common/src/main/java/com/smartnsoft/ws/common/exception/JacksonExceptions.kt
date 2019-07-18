package com.smartnsoft.ws.common.exception

/**
 * @author Anthony Msihid
 * @since 2019.07.18
 */
// The MIT License (MIT)
//
// Copyright (c) 2017 Smart&Soft
//
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
//
// The above copyright notice and this permission notice shall be included in all
// copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
// SOFTWARE.


/**
 * @author Édouard Mercier, Ludovic Roland
 * @since 2016.01.29
 */
@Suppress("unused")
abstract class JacksonExceptions
{

  open class JacksonJsonParsingException(throwable: Throwable)
    : JacksonParsingException(throwable)
  {
    companion object
    {

      private val serialVersionUID = 1L
    }

  }

  open class JacksonParsingException
  @JvmOverloads
  constructor(message: String? = null, throwable: Throwable? = null, statusCode: Int = 0)
    : CallException(message, throwable, statusCode)
  {

    constructor(throwable: Throwable? = null) : this(null, throwable, 0)

    constructor(message: String? = null, statusCode: Int = 0) : this(message, null, statusCode)

    constructor(throwable: Throwable? = null, statusCode: Int = 0) : this(null, throwable, statusCode)

    companion object
    {

      private val serialVersionUID = 1L
    }

  }

}
