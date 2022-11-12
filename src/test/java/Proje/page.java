//package pages;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import utilities.Driver;
//
//import java.util.List;
//
//public class PearlyMarketPage {
//    public PearlyMarketPage() {
//        PageFactory.initElements(Driver.getDriver(), this);
//    }
//    //Mert baslangic
//    @FindBy (xpath = "//a[@class='register inline-type']") public WebElement firstRegister;
//    @FindBy (xpath = "//a[text()='Become a Vendor']") public WebElement becomeAvendor;
//    @FindBy (xpath = "//input[@name='wcfm_email_verified_input']") public WebElement verificationCodeBox;
//    @FindBy (xpath = "(//h2)[1]") public WebElement vendorRegistration;
//    @FindBy (xpath = "//input[@id='user_email']") public WebElement emailTextBox;
//    @FindBy (xpath = "//input[@id='passoword']") public WebElement passwordTextBox;
//    @FindBy (xpath = "//input[@id='confirm_pwd']") public WebElement confirmPasswordTextBox;
//    @FindBy (xpath = "//input[@id='wcfm_membership_register_button']") public WebElement secondRegister;
//    @FindBy (xpath = "//*[text()='Registration Successfully Completed.']") public WebElement registrationSuccess;
//    @FindBy (xpath = "//div[@class='wcfm-message email_verification_message wcfm-error']")
//    public WebElement emptyEmailWarningText;
//    @FindBy (xpath = "//div[text()='Please provide a valid email address.']")
//    public WebElement validEmailWarningText;
//    @FindBy (xpath = "//div[@class='email']") public WebElement temporaryEmail;
//    @FindBy (xpath = "//td[@class='subject']") public WebElement mailClick;
//    //@FindBy (xpath = "(//iframe[@scrolling='no'])[2]") public WebElement iframe;
//    @FindBy (xpath = "//*[@id='body_content_inner']") public WebElement verificationCode;
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//    // Ibrahim Celikel Baslangic
//    @FindBy (xpath = "//*[@id='product_type']") public WebElement addProductSimpleProduct;
//    @FindBy (xpath = "//*[@id='pro_title']") public WebElement addProductProductTitle;
//    @FindBy (xpath = "//*[@id='featured_img_display']") public WebElement buyukResimEkleme;
//    @FindBy (xpath = "//*[@id='__wp-uploader-id-1']") public WebElement buyukResimEklemeSelectFiles;
//    @FindBy (xpath = "//*[@class='button media-button button-primary button-large media-button-select']") public WebElement buyukResimEklemeMediaLibrarySelectButton;
//    @FindBy (xpath = "(//*[@aria-label='x5_1027363068w0t'])[2]") public WebElement buyukResimEklemeOrnekResim;
//    @FindBy (xpath = "//*[@id='menu-item-browse']") public WebElement buyukResimMediaLibrary;
//    @FindBy (xpath = "//*[@id='gallery_img_gimage_0_display']") public WebElement kucukResimEkleme;
//    @FindBy (xpath = "(//div[@class='thumbnail'])[18]") public WebElement kucukResimEklemeOrnekResim;
//    @FindBy (xpath = "(//*[@value='399'])[1]") public WebElement productCotegory;
//    @FindBy (xpath = "(//*[.='Add to Gallery'])[9]") public WebElement kucukResimAddToGalery;
//    @FindBy (css = "#manage_stock") public WebElement productManageStock;
//    @FindBy (css = "#stock_qty") public WebElement productStockQty;
//    @FindBy (css = "#wcfm_products_simple_submit_button") public WebElement productSubmitButton;
//    @FindBy (xpath = "//*[.='Published']") public WebElement productPublishedText;
//    @FindBy (xpath = "//*[@id='backorders']") public WebElement productAllowBackorders;
//    @FindBy (xpath = "(//*[@class='page_collapsible_content_holder'])[4]") public WebElement productShipping;
//    @FindBy (css = "#weight") public WebElement shippingWeight;
//    @FindBy (css = "#length") public WebElement shippingLength;
//    @FindBy (css = "#width") public WebElement shippingWidth;
//    @FindBy (css = "#height") public WebElement shippingHeight;
//    @FindBy (css = "#_wcfmmp_processing_time") public WebElement shippingProcessingTime;
//    @FindBy (xpath = "(//*[@class='page_collapsible_content_holder'])[5]") public WebElement productAttributes;
//    @FindBy (css = "#attributes_is_active_1") public WebElement attributesColorCheckBox;
//    @FindBy (xpath = "(//*[.='Select all'])[1]") public WebElement attributesSelectAllColor;
//    @FindBy (xpath = "(//*[@class='select2-selection__rendered'])[2]") public List<WebElement> attributesColorList;
//    @FindBy (css = "#attributes_is_active_2") public WebElement attributesSizeBox;
//    @FindBy (xpath = "(//*[@class='select2-selection__rendered'])[3]") public WebElement attributesSizeDropdown;
//    @FindBy (xpath = "//li[@id='select2-attributes_value_2-result-fz2b-466']") public WebElement attributesSizeLarge;
//    @FindBy (xpath = "(//*[@aria-live='polite'])[3]") public List<WebElement> attributeSizeList;
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//    //birol macit  baslangıc
//    @FindBy (xpath = "//*[text()='Sign In']") public WebElement birolsigninanasayfa;
//    @FindBy (xpath = "(//input[@name='username'])[1]") public WebElement birolusername;
//    @FindBy (xpath = "(//input[@name='password'])[1]") public WebElement birolpassword;
//    @FindBy (xpath = "(//button[@name='login'])[1]") public WebElement birolsigninbutton;
//    @FindBy(xpath = "//span[text()='Sign Out']")    public WebElement birolSignout;
//    @FindBy(xpath = "//*[text()='Store Manager']")    public WebElement birolStoreManager;
//    @FindBy(xpath = "//*[@id=\"wcfm_menu\"]/div[5]/a/span[2]")    public WebElement birolProduct;
//    @FindBy(xpath = "//*[text()='Add New']")    public WebElement biroladdnewproduct;
//    @FindBy(xpath = "//*[@id=\"wcfm_products_manage_form_toptan-urun-gosterme-ayarlari_head\"]/div")    public WebElement biroltoptanurun;
//    @FindBy(xpath = "//select[@id='piecetype']")    public WebElement birolPiecetypeDropdown;
//    @FindBy(xpath = "//input[@id='unitpercart']")    public WebElement birolUnitsPerPiece;
//    @FindBy(xpath = "//input[@id='minorderqtytr']")    public WebElement birolMinOrderQuantity;
//    @FindBy(xpath = "//*[@id=\"wcfm_menu\"]/div[6]/a/span[2]")    public WebElement birolOrders;
//    @FindBy(xpath = "//*[@id=\"wcfm-orders\"]/tbody/tr/td[2]/span")    public WebElement birolOrdersILkAliciIsmi;
//
//    @FindBy(xpath = "//*[text()='Downloads']")    public WebElement birolDownloads;
//    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/div/div/div[3]/p")    public WebElement birolNoDiscounted;
//    @FindBy(xpath = "//*[text()='Addresses']")    public WebElement birolAdresses;
//    @FindBy(xpath = "//*[@id=\"main\"]//div[3]/div[1]/div/address/table/tbody/tr[1]/td")    public WebElement birolBillingAdressName;
//    @FindBy(xpath = "(//a[@class='edit btn btn-link btn-primary btn-underline mb-4'])[1]")    public WebElement birolEditBillingAdress;
//
//    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/div/div/div[3]/div[2]/div/address/table/tbody/tr[1]/td")    public WebElement birolShippingAdressName;
//    @FindBy(xpath = "(//a[@class='edit btn btn-link btn-primary btn-underline mb-4'])[2]")    public WebElement birolEditShippingAdress;
//    @FindBy(xpath = "//*[text()='Account details']")    public WebElement birolAccountDetails;
//    @FindBy(xpath = "//*[@id='account_first_name']")    public WebElement birolAccountFirstName ;
//    @FindBy(xpath = "//*[@id='account_last_name']")    public WebElement birolAccountLastName ;
//    @FindBy(xpath = "//*[@id='account_display_name']")    public WebElement birolAccountDisplayName ;
//    @FindBy(xpath = "//*[@id='account_email']")    public WebElement birolAccountEmailName ;
//    @FindBy(xpath = "//button[@value='Save changes']")    public WebElement birolSaveAccountDetais ;
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////birol macit  bitiş
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//    // huseyin avni şen - BAŞLANGIÇ
//    @FindBy(xpath = "//span[text()='Sign In']")     public WebElement kullaniciAnaLogin;
//    @FindBy(xpath = "//*[@id='username']")    public WebElement kullaniciUsername;
//    @FindBy(xpath = "//*[@id='password']")    public WebElement kullaniciPassword;
//    @FindBy(xpath = "//*[@type='submit']")    public WebElement kullaniciLogin2;
//    @FindBy(xpath = "//span[text()='Sign Out']")    public WebElement kullaniciSayfasiSignout;
//    @FindBy(xpath = "//*[text()='Store Manager']")    public WebElement kullaniciStoreManager;
//    @FindBy(xpath = "(//*[@class='text'])[6]")    public WebElement coupon_Link;
//    @FindBy(xpath = "//h2[text()='Coupons Listing']")    public WebElement coupon_ListingText;
//    @FindBy(xpath = "//*[@id='add_new_coupon_dashboard']")    public WebElement coupon_AddNewButton;
//    @FindBy(xpath = "//*[@id='title']")    public WebElement coupon_CodeTextBox;
//    @FindBy(xpath = "//*[@id='description']")    public WebElement coupon_DescriptionTextBox;
//    @FindBy(xpath = "//*[@id=\"discount_type\"]")    public WebElement coupon_DiscountTypeDropDown;
//    @FindBy(xpath = "//*[@id='wcfm_coupon_manager_submit_button']")    public WebElement coupon_SubmitButton;
//    @FindBy(xpath = "(//*[@class='wcfmfa fa-edit text_tip'])[1]")    public WebElement coupon_ilkKuponunLinki;
//    @FindBy(xpath = "//*[text()='Please insert atleast Coupon Title before submit.']")    public WebElement coupon_KuponOlusmadıHatasıTexti;
//    @FindBy(xpath = "//h2[text()='Edit Coupon']")    public WebElement coupon_Edit_Coupon_Texti;
//    @FindBy(xpath = "//*[@id='coupon_amount']")    public WebElement coupon_Coupon_Amount;
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//    // huseyin avni şen - SON
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//} // class sonu
