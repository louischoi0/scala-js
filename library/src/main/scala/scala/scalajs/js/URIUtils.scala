/*                     __                                               *\
**     ________ ___   / /  ___      __ ____  Scala.js API               **
**    / __/ __// _ | / /  / _ | __ / // __/  (c) 2013, LAMP/EPFL        **
**  __\ \/ /__/ __ |/ /__/ __ |/_// /_\ \    http://scala-lang.org/     **
** /____/\___/_/ |_/____/_/ | |__/ /____/                               **
**                          |/____/                                     **
\*                                                                      */



package scala.scalajs.js

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** Methods related to URIs, provided by ECMAScript 5.1. */
@js.native
@JSGlobalScope
object URIUtils extends js.Object {

  /** Decodes a Uniform Resource Identifier (URI).
   *  @see [[encodeURI]]
   */
  def decodeURI(encodedURI: String): String = js.native

  /** Decodes a Uniform Resource Identifier (URI) component.
   *  @see [[encodeURIComponent]]
   */
  def decodeURIComponent(encodedURIComponent: String): String = js.native

  /** Encodes a Uniform Resource Identifier (URI).
   *  @see [[decodeURI]]
   */
  def encodeURI(uri: String): String = js.native

  /** Encodes a Uniform Resource Identifier (URI) component.
   *  @see [[decodeURIComponent]]
   */
  def encodeURIComponent(uriComponent: String): String = js.native

}
