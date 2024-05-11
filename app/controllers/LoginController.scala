package controllers

import play.api.mvc._
import javax.inject._

@Singleton
class LoginController @Inject() (cc: ControllerComponents) extends AbstractController(cc) {

  def login() = Action { implicit request =>
    Ok(views.html.login())
  }

  def validateGet1(username:String, password:String) = Action { implicit request =>
    Ok(s"Congratulations you are logged with username: $username and password: $password")
  }
}
